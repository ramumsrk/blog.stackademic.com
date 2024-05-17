package com.stackademic.blog.exploring_the_power_of_java_records_simplifying_data_classes_in_java.table_of_contents.writing_a_record_class;

public record ClientRecord(
  long clientId,
  String firstName,
  String lastName,
  String address,
  String phoneNumber,
  String email
) {
}
