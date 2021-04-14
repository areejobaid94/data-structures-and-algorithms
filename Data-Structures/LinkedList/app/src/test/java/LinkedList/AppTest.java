/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test public void testTheInstanceOfLinkedlistClass() {
    LinkedList linkedinTestWithNoArguments = new LinkedList();
    LinkedList linkedinTestWithArguments = new LinkedList(1);

    assertEquals("Test type of linkedinTest Object", true,linkedinTestWithNoArguments.getClass() == LinkedList.class);
    assertEquals("Test if linkedList object is instanceof LinkedList class", true,linkedinTestWithNoArguments instanceof LinkedList);
    assertEquals("check making instance of class with input value", true,linkedinTestWithArguments instanceof LinkedList);
  }

  @Test public void testTheInsertMethod() {
    LinkedList linkedinTestWithNoArguments = new LinkedList();
    assertEquals("Test The initial value of the head of linked list without insert value", null,linkedinTestWithNoArguments.head);

    linkedinTestWithNoArguments.insert(1);
    assertEquals("Test The initial value of the head of linked list after insert value", 1,(int) linkedinTestWithNoArguments.head.value);

    linkedinTestWithNoArguments.insert(2);
    assertEquals("Test the value of the head after add the 2nd value", 2,(int) linkedinTestWithNoArguments.head.value);

    assertEquals("Test the string of the linked list after adding new nodes", "{ 2 } -> { 1 } -> NULL",linkedinTestWithNoArguments.toString());

    assertEquals("Is the linked list include the first inserted item", true,linkedinTestWithNoArguments.includes(1));
  }

  @Test public void testIncludeMethod() {
    LinkedList linkedinTestWithNoArguments = new LinkedList();
    linkedinTestWithNoArguments.insert(1);
    linkedinTestWithNoArguments.insert(2);

    assertEquals("Is the linked list include the first inserted item", true,linkedinTestWithNoArguments.includes(1));

    assertEquals("Is the linked list include the 2nd inserted item", true,linkedinTestWithNoArguments.includes(2));

    assertEquals("Is the linked list include Method with not inserted value", false,linkedinTestWithNoArguments.includes(3));
  }

  @Test public void testTheHead() {
    LinkedList linkedinTestWithNoArguments = new LinkedList();
    assertEquals("Test The initial value of the head", null,linkedinTestWithNoArguments.head);

    assertEquals("Test the class of the head after insert", true,linkedinTestWithNoArguments instanceof LinkedList);

    linkedinTestWithNoArguments.insert(1);
    assertEquals("Test the class of the head after insert", true,linkedinTestWithNoArguments instanceof LinkedList);
  }

  @Test public void testToString() {
    LinkedList linkedinTestWithNoArguments = new LinkedList();
    assertEquals("Test the string of the linked without adding values", "NULL",linkedinTestWithNoArguments.toString());

    linkedinTestWithNoArguments.insert(1);
    linkedinTestWithNoArguments.insert(2);

    assertEquals("Test the string of the linked list after adding new nodes", "{ 2 } -> { 1 } -> NULL",linkedinTestWithNoArguments.toString());
  }

  @Test public void testAppendMethod() {
    LinkedList linkedinTestWithNoArguments = new LinkedList();
    linkedinTestWithNoArguments.append(1);
    assertEquals("Test Value of the head after append the first element", 1,linkedinTestWithNoArguments.head.value);
    linkedinTestWithNoArguments.append(2);
    assertEquals("Test if the likedlist include the appended value", true,linkedinTestWithNoArguments.includes(1));

    assertEquals("Test the 2nd item of the likedlist if it is = the last appended value", 2,linkedinTestWithNoArguments.head.next.value);
  }

  @Test public void testInsertBeforeMethod() {
    LinkedList linkedinTestWithNoArguments = new LinkedList();
    linkedinTestWithNoArguments.append(1);
    linkedinTestWithNoArguments.insertBefore(1,2);
    assertEquals("Test Value of the head after insert before the head value", 2,linkedinTestWithNoArguments.head.value);
    assertEquals("Test if the likedlist include the appended value", true,linkedinTestWithNoArguments.includes(2));
    assertEquals("Test the 2nd item of the likedlist after insert if it is = the last head value", 1,linkedinTestWithNoArguments.head.next.value);
    linkedinTestWithNoArguments.insertBefore(1,3);
    assertEquals("Can successfully insert a node before a node located i the middle of a linked list", 3,linkedinTestWithNoArguments.head.next.value);
  }

  @Test public void testInsertAfterMethod() {
    LinkedList linkedinTestWithNoArguments = new LinkedList();
    linkedinTestWithNoArguments.append(1);
    linkedinTestWithNoArguments.insertAfter(1,2);
    assertEquals("Test Value of the head after insert After the head value", 2,linkedinTestWithNoArguments.head.next.value);
    assertEquals("Test if the likedlist include the appended value", true,linkedinTestWithNoArguments.includes(2));
    assertEquals("Test the 1st item of the likedlist after insert if it is = the last head value", 1,linkedinTestWithNoArguments.head.value);
    linkedinTestWithNoArguments.insertAfter(2,3);
    assertEquals("Can successfully insert a node before a node located i the middle of a linked list", 3,linkedinTestWithNoArguments.head.next.next.value);
  }

  // Stretch Goal
  @Test public void testDeleteNodeMethod() {
    LinkedList linkedinTestWithNoArguments = new LinkedList();
    linkedinTestWithNoArguments.append(1);
    linkedinTestWithNoArguments.insertAfter(1,2);
    linkedinTestWithNoArguments.deleteNode(1);
    assertEquals("Test delete the first node", 2,linkedinTestWithNoArguments.head.value);
    linkedinTestWithNoArguments.insertAfter(1,2);
    linkedinTestWithNoArguments.insertAfter(2,3);
    linkedinTestWithNoArguments.deleteNode(2);
    assertEquals("Test delete the mid node", 3,linkedinTestWithNoArguments.head.value);
  }

  @Test public void testKthFromEnd() {
    LinkedList linkedinTestWithNoArguments = new LinkedList();
    assertEquals("Test find item in empty likedlist", "Exception",linkedinTestWithNoArguments.kthFromEnd(0));
    linkedinTestWithNoArguments.append(1);
    linkedinTestWithNoArguments.insertAfter(1,2);
    linkedinTestWithNoArguments.append(3);
    assertEquals("Test find the first item from end", 3,linkedinTestWithNoArguments.kthFromEnd(0));
    assertEquals("Test find the 2nd item from end", 2,linkedinTestWithNoArguments.kthFromEnd(1));
    assertEquals("Test find the 3rd item from end", 1,linkedinTestWithNoArguments.kthFromEnd(2));
    assertEquals("Exception", "Exception",linkedinTestWithNoArguments.kthFromEnd(4));
  }

  // Stretch Goal
  @Test public void testFindMidPoint() {
    LinkedList linkedinTestWithNoArguments = new LinkedList();
    assertEquals("Test find item in empty likedlist", "Exception",linkedinTestWithNoArguments.kthFromEnd(0));
    linkedinTestWithNoArguments.append(1);
    linkedinTestWithNoArguments.insertAfter(1,2);
    linkedinTestWithNoArguments.append(3);
    assertEquals(2,linkedinTestWithNoArguments.findMidPoint());
  }

  @Test public void testZipLists () {
    LinkedList firstList = new LinkedList();
    LinkedList secList = new LinkedList();
    firstList.append(1);
    firstList.append(2);
    firstList.append(3);
    secList.append(4);
    secList.append(5);
    secList.append(6);
    assertEquals("Test merge two linked list with the same length", "{ 1 } -> { 4 } -> { 2 } -> { 5 } -> { 3 } -> { 6 } -> NULL",firstList.zipLists(firstList,secList));
    LinkedList emptyList = new LinkedList();
    secList = new LinkedList();
    secList.append(4);
    secList.append(5);
    secList.append(6);
    assertEquals("Test merge two linked list with first ele is empty", "{ 4 } -> { 5 } -> { 6 } -> NULL",firstList.zipLists(emptyList,secList));

  }
}