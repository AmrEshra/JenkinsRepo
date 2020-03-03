package enums;

public enum ActiveInactiveEnum {
INACTIVE(0),
ACTIVE(1);
	private int code;
    
    ActiveInactiveEnum(int code){
        this.code = code;
    }
    
    public int getCode(){return code;}
}
