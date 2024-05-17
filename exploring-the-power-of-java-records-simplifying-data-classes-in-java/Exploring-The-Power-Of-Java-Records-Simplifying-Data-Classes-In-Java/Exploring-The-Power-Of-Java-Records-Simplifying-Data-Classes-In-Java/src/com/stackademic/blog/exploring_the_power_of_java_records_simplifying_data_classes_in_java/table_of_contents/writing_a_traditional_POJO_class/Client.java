package com.stackademic.blog.exploring_the_power_of_java_records_simplifying_data_classes_in_java.table_of_contents.writing_a_traditional_POJO_class;

import java.util.Objects;

public class Client {
  // Member fields
  private long clientId;
  private String firstName;
  private String lastName;
  private String address;
  private String phoneNumber;
  private String email;
  // Constructors
  protected Client() {}
  public Client(
    long clientId,
    String firstName,
    String lastName,
    String address,
    String phoneNumber,
    String email
  ) {
      this.clientId = clientId;
      this.firstName = firstName;
      this.lastName = lastName;
      this.address = address;
      this.phoneNumber = phoneNumber;
      this.email = email;
    return;
  }
  // Getters or Accessors

  public long getClientId() {
    return this.clientId;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getAddress() {
    return this.address;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public String getEmail() {
    return this.email;
  }
  // Setters or Mutators

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  @Override
  public int hashCode() {
    return Objects.hash(
      this.clientId,
      this.firstName,
      this.lastName,
      this.address,
      this.phoneNumber,
      this.email
    );
  }
  @Override
  public boolean equals(Object object) {
      if ( this == object ) return true;
      if (
        object == null
        ||
        this.getClass() != object.getClass()
      ) return false;
      Client client = (Client) object;
    return this.clientId == client.clientId
      &&
      Objects.equals( this.firstName , client.firstName )
      &&
      Objects.equals( this.lastName , client.lastName )
      &&
      Objects.equals( this.address , client.address )
      &&
      Objects.equals( this.phoneNumber , client.phoneNumber )
      &&
      Objects.equals( this.email , client.email );
  }
  @Override
  public String toString() {
    return String.format(
      "Client[%nClient Id: %d\nFirstname: %s\nLastname: " +
        "%s\nAddress: %s\nPhone number: %s\nEmail: %s\n]",
      this.clientId,
      this.firstName,
      this.lastName,
      this.address,
      this.phoneNumber,
      this.email
    );
  }
}