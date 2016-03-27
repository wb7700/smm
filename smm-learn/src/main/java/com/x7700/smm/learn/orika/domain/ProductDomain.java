/**
 * 
 */
package com.x7700.smm.learn.orika.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wangbing
 *
 */
public class ProductDomain {

    private Address address;

    /**
     * 订单号 product_main.order_id
     */
    private Integer orderId;

    /**
     * 产品ID product_main.product_id
     */
    private Integer productId;

    /**
     * 产品品类id
     */
    private Integer productClassId;

    /**
     * 成团地点code
     */
    private Integer groupCityCode;

    /**
     * 成团地点名称
     */
    private String groupCityName;

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
     * 产品对应的部门ID product_main.department_id
     */
    private Integer departmentId;

    /**
     * 产品线ID product_main.product_line_id
     */
    private Integer productLineId;

    /**
     * 产品线名称
     */
    private String productLineName;

    /**
     * 产品线主目的地ID product_main.product_line_dest_id
     */
    private Integer productLineDestId;

    /**
     * 产品业务类型 1000-常规-2000爆款-3000预售-4000尾货-5000秒杀-6000团购-7000惠游世界套餐
     */
    private Integer productBusinessType;

    /**
     * 经理名称 product_main.manager_name
     */
    private String managerName;

    /**
     * 产品人员id product_main.producter_id
     */
    private Integer producterId;

    /**
     * 产品人员姓名 product_main.producter_name
     */
    private String producterName;

    /**
     * 产品名称 product_main.product_name
     */
    private String productName;

    /**
     * 经理id product_main.manager_id
     */
    private Integer managerId;

    /**
     * 产品类型 product_main.product_type
     */
    private Integer productType;

    /**
     * 对应的点评返现金额 product_main.cash_backed
     */
    private Long cashBacked;

    /**
     * 产品的操作备忘 product_main.remark
     */
    private String remark;

    /**
     * 出发城市 product_main.start_city_code
     */
    private Integer startCityCode;

    /**
     * 主目的城市 product_main.des_city_code
     */
    private Integer desCityCode;

    /**
     * 预定城市编号
     */
    private Integer bookCityCode;

    /**
     * 预定城市名称
     */
    private String bookCity;

    /**
     * 出发城市 product_main.start_city
     */
    private String startCity;

    /**
     * 主目的城市 product_main.des_city
     */
    private String desCity;

    /**
     * 行程最小天数 product_main.day_min
     */
    private Integer dayMin;

    /**
     * 行程最大天数 product_main.day_max
     */
    private Integer dayMax;

    /**
     * 出发时间 product_main.start_date
     */
    private Date startDate;

    /**
     * 起价 product_main.price
     */
    private BigDecimal price;

    /**
     * 是否可变行程，0不变，1可变 product_main.is_change
     */
    private Integer isChange;

    /**
     * 是否为团购 product_main.is_group_room
     */
    private Boolean isGroupRoom;

    /**
     * 团购开始时间 product_main.coupon_begin_time
     */
    private Date couponBeginTime;

    /**
     * 团购结束时间 product_main.coupon_end_time
     */
    private Date couponEndTime;

    /**
     * 归来时间 product_main.end_date
     */
    private Date endDate;

    /**
     * 产品线类型id product_main.product_line_type_id
     */
    private Integer productLineTypeId;

    /**
     * 产品特殊状态:0正常产品，1尾货产品 product_main.spec_type
     */
    private Integer specType;

    /**
     * 是否是自动打包产品：1-是。0-否 product_main.auto_package
     */
    private Integer autoPackage;

    /**
     * 行程天数（白天）
     */
    private Integer duration;

    /**
     * 行程天数（夜晚）
     */
    private Integer night;

    /**
     * 采购方式 1、打包，2、火车票+地接，3、汽车票+地接，7机票+地接,
     */
    private Integer proMode;

    /**
     * 产品最高使用抵用券额度throw new BusinessException(
     * ErrorCodeDefinition.ORD_BUSINESSVALID_ERROR .dynamicMessage(
     * "product settings error, no product line id."));
     */
    private Integer maxCoupon;

    /**
     * 是否发送出团通知
     */
    private Integer autoSendDpn;

    /**
     * planId需求
     */
    private Integer backCityCode;

    private String backCity;

    private Integer planId;

    private String backCityNme;

    // 新增目的地大类 目的地分组 目的地名称 入库
    /**
     * 目的地大类ID
     */
    private Integer destTypeId;

    /**
     * 目的地大类名称
     */
    private String destTypeName;

    /**
     * 目的地分组ID
     */
    private Integer destGroupId;

    /**
     * 目的地分组名称
     */
    private String destGroupName;

    /**
     * 目的地ID
     */
    private Integer destId;

    /**
     * 目的地名称
     */
    private String destName;

    /**
     * 国内国际 1国内 0国际
     */
    private Integer isChina;

    /**
     * 支付类型（用车）
     */
    private Integer paymentType;

    /**
     * 是否有损(用车)
     */
    private Integer hasLoss;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductClassId() {
        return productClassId;
    }

    public void setProductClassId(Integer productClassId) {
        this.productClassId = productClassId;
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

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
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

    public Integer getProductBusinessType() {
        return productBusinessType;
    }

    public void setProductBusinessType(Integer productBusinessType) {
        this.productBusinessType = productBusinessType;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getAutoPackage() {
        return autoPackage;
    }

    public void setAutoPackage(Integer autoPackage) {
        this.autoPackage = autoPackage;
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

    public Integer getProMode() {
        return proMode;
    }

    public void setProMode(Integer proMode) {
        this.proMode = proMode;
    }

    public Integer getMaxCoupon() {
        return maxCoupon;
    }

    public void setMaxCoupon(Integer maxCoupon) {
        this.maxCoupon = maxCoupon;
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

    public String getBackCity() {
        return backCity;
    }

    public void setBackCity(String backCity) {
        this.backCity = backCity;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getBackCityNme() {
        return backCityNme;
    }

    public void setBackCityNme(String backCityNme) {
        this.backCityNme = backCityNme;
    }

    public Integer getDestTypeId() {
        return destTypeId;
    }

    public void setDestTypeId(Integer destTypeId) {
        this.destTypeId = destTypeId;
    }

    public String getDestTypeName() {
        return destTypeName;
    }

    public void setDestTypeName(String destTypeName) {
        this.destTypeName = destTypeName;
    }

    public Integer getDestGroupId() {
        return destGroupId;
    }

    public void setDestGroupId(Integer destGroupId) {
        this.destGroupId = destGroupId;
    }

    public String getDestGroupName() {
        return destGroupName;
    }

    public void setDestGroupName(String destGroupName) {
        this.destGroupName = destGroupName;
    }

    public Integer getDestId() {
        return destId;
    }

    public void setDestId(Integer destId) {
        this.destId = destId;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
    }

    public Integer getIsChina() {
        return isChina;
    }

    public void setIsChina(Integer isChina) {
        this.isChina = isChina;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getHasLoss() {
        return hasLoss;
    }

    public void setHasLoss(Integer hasLoss) {
        this.hasLoss = hasLoss;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
