package com.nikolay.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The type Employee.
 *
 * @author Mikalai_Kazak @epam.com 10.12.2018
 */
public class Employee {

  private Long id;

  private Long departmentId;

  private String departmentName;

  private String fullName;

  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate birthday;

  private BigDecimal salary;

  /**
   * Instantiates a new Employee.
   */
  public Employee() {
  }

  /**
   * Instantiates a new Employee.
   *
   * @param id the id
   * @param departmentId the department id
   * @param departmentName the department name
   * @param fullName the full name
   * @param birthday the birthday
   * @param salary the salary
   */
  public Employee(Long id, Long departmentId, String departmentName, String fullName,
      LocalDate birthday,
      BigDecimal salary) {
    this.id = id;
    this.departmentId = departmentId;
    this.departmentName = departmentName;
    this.fullName = fullName;
    this.birthday = birthday;
    this.salary = salary;
  }

  /**
   * Instantiates a new Employee.
   *
   * @param departmentId the department id
   * @param departmentName the department name
   * @param fullName the full name
   * @param birthday the birthday
   * @param salary the salary
   */
  public Employee(Long departmentId, String departmentName, String fullName, LocalDate birthday,
      BigDecimal salary) {
    this.departmentId = departmentId;
    this.departmentName = departmentName;
    this.fullName = fullName;
    this.birthday = birthday;
    this.salary = salary;
  }

  /**
   * Gets id.
   *
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Gets department id.
   *
   * @return the department id
   */
  public Long getDepartmentId() {
    return departmentId;
  }

  /**
   * Sets department id.
   *
   * @param departmentId the department id
   */
  public void setDepartmentId(Long departmentId) {
    this.departmentId = departmentId;
  }

  /**
   * Gets department name.
   *
   * @return the department name
   */
  public String getDepartmentName() {
    return departmentName;
  }

  /**
   * Sets department name.
   *
   * @param departmentName the department name
   */
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  /**
   * Gets full name.
   *
   * @return the full name
   */
  public String getFullName() {
    return fullName;
  }

  /**
   * Sets full name.
   *
   * @param fullName the full name
   */
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * Gets birthday.
   *
   * @return the birthday
   */
  public LocalDate getBirthday() {
    return birthday;
  }

  /**
   * Sets birthday.
   *
   * @param birthday the birthday
   */
  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  /**
   * Gets salary.
   *
   * @return the salary
   */
  public BigDecimal getSalary() {
    return salary;
  }

  /**
   * Sets salary.
   *
   * @param salary the salary
   */
  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }
}


