package com.fang.plan.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName("Plan_Detail")
public class Plan_Detail_tb implements Serializable {
  
  private static final long serialVersionUID = 1L;
  private int  id ;
	private String  Channel ;
	private String Adplace;
	private int AdplaceId;
	private String Price; 
	private String IsPay;
	private String years;
	private String months;
	private String ReserveHour;
	private String Allowance;
	private String adpId;
	private String originality;
  private String d1;
  private String d2;
  private String d3;
  private String d4;
  private String d5;
  private String d6;
  private String d7;
  private String d8;
  private String d9;
  private String d10;
  private String d11;
  private String d12;
  private String d13;
  private String d14;
  private String d15;
  private String d16;
  private String d17;
  private String d18;
  private String d19;
  private String d20;
  private String d21;
  private String d22;
  private String d23;
  private String d24;
  private String d25;
  private String d26;
  private String d27;
  private String d28;
  private String d29;
  private String d30;
  private String d31;
  
  
 
  
  
  
  public int getAdplaceId() {
    return AdplaceId;
  }






  
  public void setAdplaceId(int adplaceId) {
    AdplaceId = adplaceId;
  }






  public int getId() {
    return id;
  }





  
  public void setId(int id) {
    this.id = id;
  }





  public String getOriginality() {
    return originality;
  }




  
  public void setOriginality(String originality) {
    this.originality = originality;
  }




  public String getAdpId() {
    return adpId;
  }



  
  public void setAdpId(String adpId) {
    this.adpId = adpId;
  }



  public String getAllowance() {
    return Allowance;
  }


  
  public void setAllowance(String allowance) {
    Allowance = allowance;
  }


  public String getReserveHour() {
    return ReserveHour;
  }

  
  public void setReserveHour(String reserveHour) {
    ReserveHour = reserveHour;
  }

  public String getChannel() {
    return Channel;
  }
  
  public void setChannel(String channel) {
    Channel = channel;
  }
  
  public String getAdplace() {
    return Adplace;
  }
  
  public void setAdplace(String adplace) {
    Adplace = adplace;
  }
  
  public String getPrice() {
    return Price;
  }
  
  public void setPrice(String price) {
    Price = price;
  }
  
  public String getIsPay() {
    return IsPay;
  }
  
  public void setIsPay(String isPay) {
    IsPay = isPay;
  }
  
  public String getYears() {
    return years;
  }
  
  public void setYears(String years) {
    this.years = years;
  }
  
  public String getMonths() {
    return months;
  }
  
  public void setMonths(String months) {
    this.months = months;
  }
  
  public String getD1() {
    return d1;
  }
  
  public void setD1(String d1) {
    this.d1 = d1;
  }
  
  public String getD2() {
    return d2;
  }
  
  public void setD2(String d2) {
    this.d2 = d2;
  }
  
  public String getD3() {
    return d3;
  }
  
  public void setD3(String d3) {
    this.d3 = d3;
  }
  
  public String getD4() {
    return d4;
  }
  
  public void setD4(String d4) {
    this.d4 = d4;
  }
  
  public String getD5() {
    return d5;
  }
  
  public void setD5(String d5) {
    this.d5 = d5;
  }
  
  public String getD6() {
    return d6;
  }
  
  public void setD6(String d6) {
    this.d6 = d6;
  }
  
  public String getD7() {
    return d7;
  }
  
  public void setD7(String d7) {
    this.d7 = d7;
  }
  
  public String getD8() {
    return d8;
  }
  
  public void setD8(String d8) {
    this.d8 = d8;
  }
  
  public String getD9() {
    return d9;
  }
  
  public void setD9(String d9) {
    this.d9 = d9;
  }
  
  public String getD10() {
    return d10;
  }
  
  public void setD10(String d10) {
    this.d10 = d10;
  }
  
  public String getD11() {
    return d11;
  }
  
  public void setD11(String d11) {
    this.d11 = d11;
  }
  
  public String getD12() {
    return d12;
  }
  
  public void setD12(String d12) {
    this.d12 = d12;
  }
  
  public String getD13() {
    return d13;
  }
  
  public void setD13(String d13) {
    this.d13 = d13;
  }
  
  public String getD14() {
    return d14;
  }
  
  public void setD14(String d14) {
    this.d14 = d14;
  }
  
  public String getD15() {
    return d15;
  }
  
  public void setD15(String d15) {
    this.d15 = d15;
  }
  
  public String getD16() {
    return d16;
  }
  
  public void setD16(String d16) {
    this.d16 = d16;
  }
  
  public String getD17() {
    return d17;
  }
  
  public void setD17(String d17) {
    this.d17 = d17;
  }
  
  public String getD18() {
    return d18;
  }
  
  public void setD18(String d18) {
    this.d18 = d18;
  }
  
  public String getD19() {
    return d19;
  }
  
  public void setD19(String d19) {
    this.d19 = d19;
  }
  
  public String getD20() {
    return d20;
  }
  
  public void setD20(String d20) {
    this.d20 = d20;
  }
  
  public String getD21() {
    return d21;
  }
  
  public void setD21(String d21) {
    this.d21 = d21;
  }
  
  public String getD22() {
    return d22;
  }
  
  public void setD22(String d22) {
    this.d22 = d22;
  }
  
  public String getD23() {
    return d23;
  }
  
  public void setD23(String d23) {
    this.d23 = d23;
  }
  
  public String getD24() {
    return d24;
  }
  
  public void setD24(String d24) {
    this.d24 = d24;
  }
  
  public String getD25() {
    return d25;
  }
  
  public void setD25(String d25) {
    this.d25 = d25;
  }
  
  public String getD26() {
    return d26;
  }
  
  public void setD26(String d26) {
    this.d26 = d26;
  }
  
  public String getD27() {
    return d27;
  }
  
  public void setD27(String d27) {
    this.d27 = d27;
  }
  
  public String getD28() {
    return d28;
  }
  
  public void setD28(String d28) {
    this.d28 = d28;
  }
  
  public String getD29() {
    return d29;
  }
  
  public void setD29(String d29) {
    this.d29 = d29;
  }
  
  public String getD30() {
    return d30;
  }
  
  public void setD30(String d30) {
    this.d30 = d30;
  }
  
  public String getD31() {
    return d31;
  }
  
  public void setD31(String d31) {
    this.d31 = d31;
  }
  
  
}
