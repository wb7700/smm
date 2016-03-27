/**
 * 
 */
package com.x7700.learn.orika.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wangbing
 *
 */
public class ProductDto {

    private Integer orderId;

    private Address address;

    /**
     * 产品ID
     */
    private Integer productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品品类id
     */
    private Integer productClassId;

    /**
     * 产品品类名称
     */
    private String productClassName;

    /**
     * 产品子品类id
     */
    private Integer productChildClassId;

    /**
     * 产品子品类名称
     */
    private String productChildClassName;

    /**
     * 产品线ID
     */
    private Integer productLineId;

    /**
     * 产品线名称
     */
    private String productLineName;

    /**
     * 产品线主目的地ID
     */
    private Integer productLineDestId;

    /**
     * 经理名称
     */
    private String managerName;

    /**
     * 成团地点code
     */
    private Integer groupCityCode;

    /**
     * 成团地点名称
     */
    private String groupCityName;

    /**
     * 产品人员ID
     */
    private Integer producterId;

    /**
     * 产品人员姓名
     */
    private String producterName;

    /**
     * 经理ID
     */
    private Integer managerId;

    /**
     * 产品类型
     */
    private Integer productType;

    /**
     * 对应的点评返现金额
     */
    private Long cashBacked;

    /**
     * 出发城市编码
     */
    private Integer startCityCode;

    /**
     * 目的城市编码
     */
    private Integer desCityCode;

    /**
     * 出发城市名称
     */
    private String startCity;

    /**
     * 目的城市名称
     */
    private String desCity;

    /**
     * 预定城市编号
     */
    private Integer bookCityCode;

    /**
     * 预定城市名称
     */
    private String bookCity;

    /**
     * 行程最小天数
     */
    private Integer dayMin;

    /**
     * 行程最大天数
     */
    private Integer dayMax;

    /**
     * 行程天数（白天）
     */
    private Integer duration;

    /**
     * 行程天数（夜晚）
     */
    private Integer night;

    /**
     * 出发时间
     */
    private Date startDate;

    /**
     * 起价
     */
    private BigDecimal price;

    /**
     * 是否可变行程，0不变，1可变
     */
    private Integer isChange;

    /**
     * 是否为团购
     */
    private Boolean isGroupRoom;

    /**
     * 团购开始时间
     */
    private Date couponBeginTime;

    /**
     * 团购结束时间
     */
    private Date couponEndTime;

    /**
     * 归来时间
     */
    private Date endDate;

    /**
     * 产品线类型id
     */
    private Integer productLineTypeId;

    /**
     * 产品特殊状态:0正常产品，1尾货产品
     */
    private Integer specType;

    /**
     * 产品最高使用抵用券额度
     */
    private Integer maxCoupon;

    /**
     * 是否是自动打包产品：1-是。0-否
     */
    private Integer autoPackage;

    /**
     * 是否自动发送出团通知，0否，1是
     */
    private Integer autoSendDpn;

    private Integer backCityCode;

    private Integer planId;

    private String backCity;

    private String backCityName;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductClassId() {
        return productClassId;
    }

    public void setProductClassId(Integer productClassId) {
        this.productClassId = productClassId;
    }

    public String getProductClassName() {
        return productClassName;
    }

    public void setProductClassName(String productClassName) {
        this.productClassName = productClassName;
    }

    public Integer getProductChildClassId() {
        return productChildClassId;
    }

    public void setProductChildClassId(Integer productChildClassId) {
        this.productChildClassId = productChildClassId;
    }

    public String getProductChildClassName() {
        return productChildClassName;
    }

    public void setProductChildClassName(String productChildClassName) {
        this.productChildClassName = productChildClassName;
    }

    public Integer getProductLineId() {
        return productLineId;
    }

    public void setProductLineId(Integer productLineId) {
        this.productLineId = productLineId;
    }

    public String getProductLineName() {
        return productLineName;
    }

    public void setProductLineName(String productLineName) {
        this.productLineName = productLineName;
    }

    public Integer getProductLineDestId() {
        return productLineDestId;
    }

    public void setProductLineDestId(Integer productLineDestId) {
        this.productLineDestId = productLineDestId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Integer getGroupCityCode() {
        return groupCityCode;
    }

    public void setGroupCityCode(Integer groupCityCode) {
        this.groupCityCode = groupCityCode;
    }

    public String getGroupCityName() {
        return groupCityName;
    }

    public void setGroupCityName(String groupCityName) {
        this.groupCityName = groupCityName;
    }

    public Integer getProducterId() {
        return producterId;
    }

    public void setProducterId(Integer producterId) {
        this.producterId = producterId;
    }

    public String getProducterName() {
        return producterName;
    }

    public void setProducterName(String producterName) {
        this.producterName = producterName;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Long getCashBacked() {
        return cashBacked;
    }

    public void setCashBacked(Long cashBacked) {
        this.cashBacked = cashBacked;
    }

    public Integer getStartCityCode() {
        return startCityCode;
    }

    public void setStartCityCode(Integer startCityCode) {
        this.startCityCode = startCityCode;
    }

    public Integer getDesCityCode() {
        return desCityCode;
    }

    public void setDesCityCode(Integer desCityCode) {
        this.desCityCode = desCityCode;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getDesCity() {
        return desCity;
    }

    public void setDesCity(String desCity) {
        this.desCity = desCity;
    }

    public Integer getBookCityCode() {
        return bookCityCode;
    }

    public void setBookCityCode(Integer bookCityCode) {
        this.bookCityCode = bookCityCode;
    }

    public String getBookCity() {
        return bookCity;
    }

    public void setBookCity(String bookCity) {
        this.bookCity = bookCity;
    }

    public Integer getDayMin() {
        return dayMin;
    }

    public void setDayMin(Integer dayMin) {
        this.dayMin = dayMin;
    }

    public Integer getDayMax() {
        return dayMax;
    }

    public void setDayMax(Integer dayMax) {
        this.dayMax = dayMax;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getNight() {
        return night;
    }

    public void setNight(Integer night) {
        this.night = night;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getIsChange() {
        return isChange;
    }

    public void setIsChange(Integer isChange) {
        this.isChange = isChange;
    }

    public Boolean getIsGroupRoom() {
        return isGroupRoom;
    }

    public void setIsGroupRoom(Boolean isGroupRoom) {
        this.isGroupRoom = isGroupRoom;
    }

    public Date getCouponBeginTime() {
        return couponBeginTime;
    }

    public void setCouponBeginTime(Date couponBeginTime) {
        this.couponBeginTime = couponBeginTime;
    }

    public Date getCouponEndTime() {
        return couponEndTime;
    }

    public void setCouponEndTime(Date couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getProductLineTypeId() {
        return productLineTypeId;
    }

    public void setProductLineTypeId(Integer productLineTypeId) {
        this.productLineTypeId = productLineTypeId;
    }

    public Integer getSpecType() {
        return specType;
    }

    public void setSpecType(Integer specType) {
        this.specType = specType;
    }

    public Integer getMaxCoupon() {
        return maxCoupon;
    }

    public void setMaxCoupon(Integer maxCoupon) {
        this.maxCoupon = maxCoupon;
    }

    public Integer getAutoPackage() {
        return autoPackage;
    }

    public void setAutoPackage(Integer autoPackage) {
        this.autoPackage = autoPackage;
    }

    public Integer getAutoSendDpn() {
        return autoSendDpn;
    }

    public void setAutoSendDpn(Integer autoSendDpn) {
        this.autoSendDpn = autoSendDpn;
    }

    public Integer getBackCityCode() {
        return backCityCode;
    }

    public void setBackCityCode(Integer backCityCode) {
        this.backCityCode = backCityCode;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getBackCity() {
        return backCity;
    }

    public void setBackCity(String backCity) {
        this.backCity = backCity;
    }

    public String getBackCityName() {
        return backCityName;
    }

    public void setBackCityName(String backCityName) {
        this.backCityName = backCityName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

}
