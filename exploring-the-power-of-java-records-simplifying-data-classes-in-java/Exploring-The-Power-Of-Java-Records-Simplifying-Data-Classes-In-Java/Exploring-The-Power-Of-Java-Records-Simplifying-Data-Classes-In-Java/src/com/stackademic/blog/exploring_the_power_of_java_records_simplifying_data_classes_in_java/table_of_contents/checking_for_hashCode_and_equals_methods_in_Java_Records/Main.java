package com.stackademic.blog.exploring_the_power_of_java_records_simplifying_data_classes_in_java.table_of_contents.checking_for_hashCode_and_equals_methods_in_Java_Records;

import com.stackademic.blog.exploring_the_power_of_java_records_simplifying_data_classes_in_java.table_of_contents.writing_a_record_class.ClientRecord;

import static java.lang.System.out;

public class Main {
  public static void main( String... args ) {
      ClientRecord thirdClientRecord = new ClientRecord(
        101,
        "Mark",
        "Anderson",
        "42 Java Street",
        "0001111",
        "mark.a@gmail.com"
      );
      ClientRecord fourthClientRecord = new ClientRecord(
        102,
        "Dean",
        "Becker",
        "42 Java Street",
        "0001111",
        "mark.a@gmail.com"
      );
      out.printf("Hashcode of %s is %d\n",thirdClientRecord,
        thirdClientRecord.hashCode());
      out.printf("Hashcode of %s is %d\n",fourthClientRecord,
        fourthClientRecord.hashCode());
      out.printf("Are %s and %s equal? %s\n",thirdClientRecord,
        fourthClientRecord,thirdClientRecord.equals(fourthClientRecord));
    return;
  }
}
