package com.entity.view;

import com.entity.CartEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 购物车
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("cart")
public class CartView extends CartEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 shuiguo
			/**
			* 水果名称
			*/
			private String shuiguoName;
			/**
			* 水果照片
			*/
			private String shuiguoPhoto;
			/**
			* 水果类型
			*/
			private Integer shuiguoTypes;
				/**
				* 水果类型的值
				*/
				private String shuiguoValue;
			/**
			* 水果库存
			*/
			private Integer shuiguoKucunNumber;
			/**
			* 水果原价
			*/
			private Double shuiguoOldMoney;
			/**
			* 现价
			*/
			private Double shuiguoNewMoney;
			/**
			* 点击次数
			*/
			private Integer shuiguoClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer shuiguoDelete;
			/**
			* 水果简介
			*/
			private String shuiguoContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public CartView() {

	}

	public CartView(CartEntity cartEntity) {
		try {
			BeanUtils.copyProperties(this, cartEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}























				//级联表的get和set shuiguo

					/**
					* 获取： 水果名称
					*/
					public String getShuiguoName() {
						return shuiguoName;
					}
					/**
					* 设置： 水果名称
					*/
					public void setShuiguoName(String shuiguoName) {
						this.shuiguoName = shuiguoName;
					}

					/**
					* 获取： 水果照片
					*/
					public String getShuiguoPhoto() {
						return shuiguoPhoto;
					}
					/**
					* 设置： 水果照片
					*/
					public void setShuiguoPhoto(String shuiguoPhoto) {
						this.shuiguoPhoto = shuiguoPhoto;
					}

					/**
					* 获取： 水果类型
					*/
					public Integer getShuiguoTypes() {
						return shuiguoTypes;
					}
					/**
					* 设置： 水果类型
					*/
					public void setShuiguoTypes(Integer shuiguoTypes) {
						this.shuiguoTypes = shuiguoTypes;
					}


						/**
						* 获取： 水果类型的值
						*/
						public String getShuiguoValue() {
							return shuiguoValue;
						}
						/**
						* 设置： 水果类型的值
						*/
						public void setShuiguoValue(String shuiguoValue) {
							this.shuiguoValue = shuiguoValue;
						}

					/**
					* 获取： 水果库存
					*/
					public Integer getShuiguoKucunNumber() {
						return shuiguoKucunNumber;
					}
					/**
					* 设置： 水果库存
					*/
					public void setShuiguoKucunNumber(Integer shuiguoKucunNumber) {
						this.shuiguoKucunNumber = shuiguoKucunNumber;
					}

					/**
					* 获取： 水果原价
					*/
					public Double getShuiguoOldMoney() {
						return shuiguoOldMoney;
					}
					/**
					* 设置： 水果原价
					*/
					public void setShuiguoOldMoney(Double shuiguoOldMoney) {
						this.shuiguoOldMoney = shuiguoOldMoney;
					}

					/**
					* 获取： 现价
					*/
					public Double getShuiguoNewMoney() {
						return shuiguoNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setShuiguoNewMoney(Double shuiguoNewMoney) {
						this.shuiguoNewMoney = shuiguoNewMoney;
					}

					/**
					* 获取： 点击次数
					*/
					public Integer getShuiguoClicknum() {
						return shuiguoClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setShuiguoClicknum(Integer shuiguoClicknum) {
						this.shuiguoClicknum = shuiguoClicknum;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getShuiguoDelete() {
						return shuiguoDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setShuiguoDelete(Integer shuiguoDelete) {
						this.shuiguoDelete = shuiguoDelete;
					}

					/**
					* 获取： 水果简介
					*/
					public String getShuiguoContent() {
						return shuiguoContent;
					}
					/**
					* 设置： 水果简介
					*/
					public void setShuiguoContent(String shuiguoContent) {
						this.shuiguoContent = shuiguoContent;
					}








				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}




}
