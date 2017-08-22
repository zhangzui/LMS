package com.traveloka.creditUser.api.vo.user;



import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>注册用户需求</p>
 * User: minxiangfei
 * Date: 14-8-7
 * Time: 上午10:20
 */
public class UserRegisterReqVo extends CheckRegisterReqVo implements Serializable {

    private static final long serialVersionUID = -1482186049479899442L;

    /**
     * 商户号
     */
    private String merchantCode;

    /**
     * 短信验证码
     */
    private String phoneLoginNo;

    /**
     * token
     */
    private String token;

    /**
     *邮件
     */
    private String mail;

    /**
     * 激活单号
     */
    private String activeNo;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 地区ID
     */
    private String county;

    /**
     * 地址
     */
    private String address;

    /**
     * 省编码
     */
    private String provinceCode;

    /**
     * 市编码
     */
    private String cityCode;

    /**
     * 地区编码
     */
    private String countyCode;

    /**
     * 镇
     */
    private String town;

    /**
     * 镇编码
     */
    private String townCode;

    /**
     * 支付信息
     */
    //private UserPayInfo userPayInfo;

//  姓名
    private String Name;
//  京东pin
    private String JDpin;
    //  mail
    private String eMail;
    /**
     * 是否记录激活明细标志
     */
    private boolean isinsertActive;

    /**
     * 联系人姓名
     */
    private String relativesContactsName;

    /**
     * 联系人电话
     */
    private String relativesContactsMobile;

    /**
     * 联系人关系
     */
    private String relativesContactsRelationship;

    private Map<String,String> extMap = new HashMap<String, String>();

    public String getPhoneLoginNo() {
        return phoneLoginNo;
    }

    public void setPhoneLoginNo(String phoneLoginNo) {
        this.phoneLoginNo = phoneLoginNo;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsinsertActive() {
        return isinsertActive;
    }

    public void setIsinsertActive(boolean isinsertActive) {
        this.isinsertActive = isinsertActive;
    }

    public String getActiveNo() {
        return activeNo;
    }

    public void setActiveNo(String activeNo) {
        this.activeNo = activeNo;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    /*public UserPayInfo getUserPayInfo() {
        return userPayInfo;
    }

    public void setUserPayInfo(UserPayInfo userPayInfo) {
        this.userPayInfo = userPayInfo;
    }
*/
    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }

    public String getValue(String key){
        return extMap.get(key);
    }

    public void setValue(String key,String value){
        extMap.put(key,value);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJDpin() {
        return JDpin;
    }

    public void setJDpin(String JDpin) {
        this.JDpin = JDpin;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getRelativesContactsName() {
        return relativesContactsName;
    }

    public void setRelativesContactsName(String relativesContactsName) {
        this.relativesContactsName = relativesContactsName;
    }

    public String getRelativesContactsMobile() {
        return relativesContactsMobile;
    }

    public void setRelativesContactsMobile(String relativesContactsMobile) {
        this.relativesContactsMobile = relativesContactsMobile;
    }

    public String getRelativesContactsRelationship() {
        return relativesContactsRelationship;
    }

    public void setRelativesContactsRelationship(String relativesContactsRelationship) {
        this.relativesContactsRelationship = relativesContactsRelationship;
    }
}
