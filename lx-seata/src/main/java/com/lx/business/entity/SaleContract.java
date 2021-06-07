package com.lx.business.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 销售合同主表
 * </p>
 *
 * @author luxing
 * @since 2021-05-24
 */
@Data
@Accessors(chain = true)
@TableName("t_xs_sale_contract")
public class SaleContract {

    private static final long serialVersionUID=1L;

    /**
     * 合同ID
     */
    @TableId("sale_contract_id")
    private String saleContractId;

    /**
     * 合同编号
     */
    private String saleContractNo;

    /**
     * 型云开单生成的合同标记id
     */
    private String cloudContractId;

    /**
     * 长协协议编号
     */
    private String saleAgreementNo;

    /**
     * 审核状态
     */
    private String auditStatus;

    /**
     * 货齐
     */
    private Boolean goodsFlag;

    /**
     * 票齐
     */
    private Boolean invoiceFlag;

    /**
     * 提货方式
     */
    private String deliveryType;

    /**
     * 运输方式
     */
    private String transportType;

    /**
     * 支付方式(现金、信用)
     */
    private String payMethod;

    /**
     * 运输结算方式
     */
    private String transportSettlementType;

    /**
     * 合同付款状态
     */
    private String contractPayStatus;

    /**
     * 销售合同来源(型云、erp等)
     */
    private String sourceType;

    /**
     * 合同延期次数
     */
    private Integer contractDelayTimes;

    /**
     * 合同时间
     */
    private LocalDateTime saleContractDate;

    /**
     * 合同延期时间
     */
    private LocalDateTime contractDelayDate;

    /**
     * 预计提货日期
     */
    private LocalDateTime preLadingDate;

    /**
     * 销售地区id
     */
    private String saleAreaId;

    /**
     * 销售地区名称
     */
    private String saleAreaName;

    /**
     * 合同类型
     */
    private String contractType;

    /**
     * 是否收吊装费
     */
    private String hoistingCostFlag;

    /**
     * 是否议价
     */
    private Boolean bargainFlag;

    /**
     * 客户意向
     */
    private String intention;

    /**
     * 购货单位
     */
    private String buyUnitId;

    /**
     * 购货单位名称
     */
    private String buyUnitName;

    /**
     * 结算单位
     */
    private String settlementUnitId;

    /**
     * 结算单位名称
     */
    private String settlementUnitName;

    /**
     * 业务员
     */
    private String businessUserCode;

    /**
     * 业务员名称
     */
    private String businessUserName;

    /**
     * 业务员微信
     */
    private String businessUserWeixin;

    /**
     * 业务部门
     */
    private String businessDepartmentId;

    /**
     * 提货仓库
     */
    private String extractWarehouseId;

    /**
     * 合同数量
     */
    private Integer contractAmount;

    /**
     * 合同理重
     */
    private BigDecimal contractManagerWeight;

    /**
     * 合同磅重
     */
    private BigDecimal contractPoundWeight;

    /**
     * 应收金额(含税)
     */
    private BigDecimal inTaxReceiveMoney;

    /**
     * 应收金额(无税)
     */
    private BigDecimal noTaxReceiveMoney;

    /**
     * 已付金额(含税)
     */
    private BigDecimal inTaxPayMoney;

    /**
     * 已付金额(无税)
     */
    private BigDecimal noTaxPayMoney;

    /**
     * 已执行金额(无税)
     */
    private BigDecimal noTaxExecuteMoney;

    /**
     * 已执行金额(含税)
     */
    private BigDecimal inTaxExecuteMoney;

    /**
     * 可用金额(含税)
     */
    private BigDecimal inTaxAvailableMoney;

    /**
     * 可用金额(无税)
     */
    private BigDecimal noTaxAvailableMoney;

    /**
     * 型云合同状态
     */
    private String xingyunContractStatus;

    /**
     * 预付款百分比
     */
    private BigDecimal advancePaymentPer;

    /**
     * 预付款金额
     */
    private BigDecimal advancePaymentMoney;

    /**
     * 发货计划锁定金额(含税)
     */
    private BigDecimal inTaxPlanLockMoney;

    /**
     * 发货计划锁定金额(无税)
     */
    private BigDecimal noTaxPlanLockMoney;

    /**
     * 已实提金额(含税)
     */
    private BigDecimal inTaxLadingMoney;

    /**
     * 已实提金额(无税)
     */
    private BigDecimal noTaxLadingMoney;

    /**
     * 已结算金额(含税)
     */
    private BigDecimal inTaxSettlementMoney;

    /**
     * 已结算金额(无税)
     */
    private BigDecimal noTaxSettlementMoney;

    /**
     * 可以开发票金额
     */
    private BigDecimal invoiceMoney;

    /**
     * 不可以开发票金额
     */
    private BigDecimal noInvoiceMoney;

    /**
     * 备注
     */
    private String remark;

    /**
     * 发货计划锁定数量
     */
    private Integer planAmount;

    /**
     * 发货计划锁定理重
     */
    private BigDecimal planManagerWeight;

    /**
     * 发货计划锁定磅重
     */
    private BigDecimal planPoundWeight;

    /**
     * 提货单锁定数量
     */
    private Integer ladingAmount;

    /**
     * 提货单锁定理重
     */
    private BigDecimal ladingManagerWeight;

    /**
     * 提货单锁定磅重
     */
    private BigDecimal ladingPoundWeight;

    /**
     * 实提数量
     */
    private Integer outAmount;

    /**
     * 实提磅重
     */
    private BigDecimal outManagerWeight;

    /**
     * 实提理重
     */
    private BigDecimal outPoundWeight;

    /**
     * 已开发票数量
     */
    private Integer invoiceAmount;

    /**
     * 已开发票理量
     */
    private BigDecimal invoiceManagerWeight;

    /**
     * 已开发票磅量
     */
    private BigDecimal invoicePoundWeight;

    /**
     * 退货数量
     */
    private Integer returnAmount;

    /**
     * 退货理重
     */
    private BigDecimal returnManagerWeight;

    /**
     * 退货磅重
     */
    private BigDecimal returnPoundWeight;

    /**
     * 打印次数
     */
    private Integer printCount;

    /**
     * 下载次数
     */
    private Integer downloadCount;

    /**
     * 签章状态
     */
    private String signStatus;

    /**
     * 省级名称(收货地址)
     */
    private String province;

    /**
     * 市级名称(收货地址)
     */
    private String city;

    /**
     * 县级名称(收货地址)
     */
    private String county;

    /**
     * 详细地址(收货地址)
     */
    private String receiveAddress;

    /**
     * 联系人
     */
    private String contactPerson;

    /**
     * 联系电话
     */
    private String contactPhone;

    /**
     * 联系人微信
     */
    private String contactWeixin;

    /**
     * 是否是特殊合同(是，走特殊的工作流)
     */
    private Boolean isSpecial;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 删除标志
     */
    private Boolean delFlag;

    /**
     * 创建人
     */
    private String createUserCode;

    /**
     * 创建人名称
     */
    private String createUserName;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 修改人
     */
    private String updateUserCode;

    /**
     * 修改人名称
     */
    private String updateUserName;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 系统ID
     */
    private String sysId;

    /**
     * 平台ID
     */
    private String platformId;

    /**
     * 机构ID
     */
    private String orgId;

    /**
     * 公司名称
     */
    private String orgName;

    /**
     * 部门ID
     */
    private String departmentId;

    /**
     * 合同延期天数
     */
    private Integer delayDay;

    /**
     * 客户性质(新、老客户)
     */
    private String customerType;

    /**
     * 吊费金额
     */
    private BigDecimal liftingFeeMoney;

    /**
     * 货款金额
     */
    private BigDecimal goodsMoney;

    /**
     * 需求类型(开平、销售)
     */
    private String demandType;

    /**
     * 付款完成时间
     */
    private LocalDateTime paySuccessDate;

    /**
     * 合同延迟临时天数
     */
    private Integer delayTempDay;

    /**
     * 入库机构id
     */
    private String inOrgId;

    /**
     * 延迟原因
     */
    private String delayReason;

    /**
     * 申请货齐 数据字典为系统通用审批状态
     */
    private String applyGoodsFlag;

    /**
     * 白条抵二次补款标记
     */
    private Boolean creditSupplyFlag;

    /**
     * 白条抵尾款标记
     */
    private Boolean creditEndFlag;

    /**
     * 客户性质
     */
    private String quality;

    /**
     * 发送提货短信标识
     */
    private Boolean ladingSmsFlag;

    /**
     * 微信小程序分享标识
     */
    private Boolean wechatShareFlag;

    /**
     * 价格模式  数据字典: 销售合同价格模式
     */
    private String priceModel;

    /**
     * 待修改状态  01：未确认；02.已确认;
     */
    private String pendingStatus;

    /**
     * 型云历史合同状态
     */
    private String oldXingyunContractStatus;

    /**
     * 制单人code
     */
    private String orderMakerCode;

    /**
     * 制单人姓名
     */
    private String orderMakerName;


}
