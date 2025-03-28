import mitt from 'mitt'

/*
mitt
- 경량화된 이벤트 에미터 라이브러리
- 간단한 이벤트 기반 통신을 구현 가능
*/
export const emitter = mitt()

emitter.on('*', (type, e) => console.log(`#이벤트 로그 : ${type} -> ${e}`))
