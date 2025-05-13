package lecture;

public class Pharmacy {
    // 요양기관명
    private String name;
    // 종별코드
    private String typeCode;
    // 종별코드명
    private String typeName;
    // 시도코드
    private String cityCode;
    // 시도코드명
    private String cityName;
    // 시군구코드
    private String districtCode;
    // 시군구코드명
    private String districtName;
    // 읍면동
    private String town;
    // 우편번호
    private String postalCode;
    // 주소
    private String address;
    // 전화번호
    private String phone;
    // 개설일자
    private String openDate;
    // 좌표(X)
    private double coordX;
    // 좌표(Y)
    private double coordY;

    public Pharmacy(String[] field) {
        this.name = field[0];
        this.typeCode = field[1];
        this.typeName = field[2];
        this.cityCode = field[3];
        this.cityName = field[4];
        this.districtCode = field[5];
        this.districtName = field[6];
        this.town = field[7];
        this.postalCode = field[8];
        this.address = field[9];
        this.phone = field[10];
        this.openDate = field[11];

        // 빈값일때 기본값 0.0으로 설정
        this.coordX = field[12].isBlank() ? 0.0 : Double.parseDouble(field[12]);
        this.coordY = field[13].isBlank() ? 0.0 : Double.parseDouble(field[13]);
    }

    public String getName() {
        return name;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getTown() {
        return town;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getOpenDate() {
        return openDate;
    }

    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    @Override
    public String toString() {
        return name + " - " + address;
    }
}