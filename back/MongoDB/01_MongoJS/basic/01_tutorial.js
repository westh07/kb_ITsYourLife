// 데이터베이스를 tutorial로 선정하세요.
use tutorial

/*
* ✅ insertOne()
* - 하나의 문서를 컬렉션에 추가하는 명령어
* - 형식 : db.컬렉션명.insertOne({키 key : 값 value,...})
* ✅ insertMany()
* - 하나의 문서를 컬렉션에 추가하는 명령어
* - 형식 : db.컬렉션명.insertMany([{key : value,...},{key : value,...},...])
*
* -> key 값 id 자동으로 생성
* */
// users 컬렉션에 username이 smith인 문서를 저장하세요.
db.users.insertOne({username:"smith"})

// users 컬렉션에 username이 jones인 문서를 저장하세요.
db.users.insertOne({username:"jones"})

// 여러개의 도큐먼트를 한번에 추가
db.users.insertMany([{username:"tiger"},{username:"candy"}])

/*
* ✅ find
* - 컬렉션에서 문서를 조회하는 명령어
* - 형식 : db.컬렉션명.find({조건},{프로젝션})
* */
// 앞에서 저장한 모든 문서를 출력하세요
db.users.find()
db.users.find({},{_id:0}) // 빈 조건문을 작성해줘야함

// 앞에서 저장한 문서 중 하나 만 출력하세요
db.users.findOne()

// users 컬렉션에서 username이 "jones"인 문서를 찾아서 출력하세요.
db.users.find({username:"jones"})

// users 컬렉션에서 username이 "jones" 또는 "smith"인 문서를 찾아서 출력하세요.
db.users.find({$or:[
        {username:"jones"},
        {username:"smith"}
    ]})

/*
* ✅ UpdateOne()
* - 조건에 맞는 첫번째 문서를 수정
* - 형식 : db.컬렉션명.updateOne({조건},{$set:{수정할 필드}})
*
* ✅ UpdateMany()
* - 조건에 맞는 모든 문서를 수정
* - 형식 : db.컬렉션명.UpdateMany({조건},{$set:{수정할 필드}})
* */
// users 컬렉션에서 username이 smith인 문서에 country 키가 Canada 가 되도록 수정하세요.
db.users.updateOne({username:"smith"},{$set:{country:"canada"}})

// 앞의 문서가 올바르게 수정되었는지 확인하세요
db.users.find()
db.users.find({country:"canada"})

/*
* ✅ replaceOne
* - 조건에 맞는 문서를 새문서로 교체
* - 기존 문서의 모든 필드가 삭제되고, 새 필드로 대체됨(주의!!)
* */
// users 컬렉션에서 username이 smith인 문서를 {country: "Canada"}로 대체하고 확인하세요.
db.users.replaceOne({username:"smith"},{country:"canada"})

// users 컬렉션에서 country가 Canada인 문서를 {username: "smith", country: "Canada"}로 대체하고 확인하세요.
db.users.replaceOne({country:"canada"},{username:"smith",country:"canada"})
db.users.find()

// users 컬렉션에서 username이 smith인 문서에서 country 키를 삭제하고, 삭제 여부를 확인하세요.
db.users.updateOne({username:'smith'},{$unset : {country:""}})

// users 컬렉션에서 username이 smith인 문서에서 country 키를 삭제하고, 삭제 여부를 확인하세요.
db.users.updateOne({username:'smith'},{$unset : {country:""}})

// 데이터베이스 전체 목록을 출력하세요.
show dbs

// 현재 사용 중인 데이터베이스의 컬렉션 목록을 출력하세요.
show collections

/*
* ✅ stats
* - 데이터베이스 또는 컬렉션의 상태정보확인
* - 문자수, 크기, 저장 공간 등을 확인 가능
* */
// 현재 사용 중인 데이터베이스와 users 컬렉션의 상태를 출력하세요
db.stats()
db.users.stats()

/*
* ✅ deleteOne
* - 조건에 맞는 첫번째 문서를 삭제
* - 형식 : db.컬렉션명.deleteOne({조건})
*
* ✅ deleteMany
* - db.users.deleteMany({})
* - 조건이 없으면 전체가 삭제되므로 주의 필요!
* */

// users 컬렉션에서 username이 smith인 문서를 삭제하고, 삭제여부를 확인하세요.
db.users.deleteOne({username:"smith"})
db.users.find({username:"smith"})

// users 컬렉션의 모든 문서를 삭제하고, 삭제 여부를 확인하세요.
db.users.deleteMany({})
db.users.find().count()

/*
* ✅ drop
* - 컬렉션 자체를 삭제
* - 형식 : db.컬렉션명.drop()
* */
// users 컬렉션을 삭제하세요
db.users.drop()