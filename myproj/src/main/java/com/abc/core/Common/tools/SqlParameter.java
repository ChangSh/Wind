package com.abc.core.Common.tools;

public class SqlParameter {
  
  /**
   * 参数名称
   */
  public String Name;
  
  /**
   * 参数值
   */
  public Object Value;
  
  /**
   * true表示参数为输出类型
   */
  public boolean OutPut;
  
  /**
   * 参数类型
   */
  public int Type;
  
  /**
   * 输入类型参数的构造函数
   * 
   * @param name
   *        输入类型 参数名称
   * @param value
   *        输入类型 参数值
   */
  public SqlParameter(String name, Object value) {
    this.Name = name;
    this.Value = value;
  }
  
  /**
   * 输出类型参数的构造函数
   * 
   * @param type
   *        输出类型 参数类型
   * @param name
   *        输出类型 参数名称
   */
  public SqlParameter(int type, String name) {
    this.Name = name;
    this.OutPut = true;
    this.Type = type;
  }
  
  /**
   * 返回类型参数的构造函数
   * 
   * @param type
   *        存储过程 返回类型
   */
  public SqlParameter(int type) {
    this.Name = "";
    this.OutPut = true;
    this.Type = type;
  }
}