package Recursion;

import MediumPractices.TaskScheduler;

import java.util.ArrayList;

public class ReverseLinkedList {
    /*Given the head of a singly linked list, reverse the list, and return the reversed list.

    Input: head = [1,2,3,4,5]
    Output: [5,4,3,2,1]
     */
    ListNode result = new ListNode();
    ArrayList<Integer> list = new ArrayList<>();
    public ListNode reverseList(ListNode head) {

        // Caso base: lista vacía o con un solo nodo
        if (head == null || head.next == null) {
            return head;
        }
        // Llamada recursiva: invertimos el resto de la lista
        ListNode newHead = reverseList(head.next);
        // Reversión del enlace
        head.next.next = head;
        // Desconectamos el nodo actual
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.reverseList(head);
    }
}

