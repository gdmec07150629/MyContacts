package cn.edu.gdmec.s07150629.mycontacts;

/**
 * Created by Administration on 2016/10/23.
 */
public class User {
    public final static String NAME = "name";
    public static final String MOBILE = "mobile";
    public static final String QQ = "qq";
    public static final String DANWEI = "danwei";
    public static final String ADDRESS = "address";

    private String name;
    private String mobile;
    private String qq;
    private String danwei;
    private String address;
    private int id_DB=-1;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public int getId_DB() {
        return id_DB;
    }

    public void setId_DB(int id_DB) {
        this.id_DB = id_DB;
    }
}
