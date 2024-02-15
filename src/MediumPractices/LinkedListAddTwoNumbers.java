package MediumPractices;

import java.util.LinkedList;

/**
 */
  //Definition for singly-linked list.

public class LinkedListAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int totalSum;
        String list1 = "";
        String list2 = "";
        list1 = invertString(convertListToString(l1, list1));
        list2 = invertString(convertListToString(l2, list2));



        totalSum = Integer.parseInt(list1) + Integer.parseInt(list2);
        String resultSum = totalSum+"";

        ListNode dummy = new ListNode(); // Nodo ficticio para iniciar la lista
        ListNode current = dummy; // Nodo actual que se utilizará para agregar nodos

        for (int i = resultSum.length()-1; i >= 0 ; i--) {
            int digit = Character.getNumericValue(resultSum.charAt(i)); // Obtener el valor numérico del carácter
            ListNode newNode = new ListNode(digit); // Crear un nuevo nodo con el valor del carácter
            current.next = newNode; // Establecer el nuevo nodo como siguiente del nodo actual
            current = current.next; // Mover al siguiente nodo
        }

        ListNode ln = dummy.next;

        return ln;
    }

    public String convertListToString(ListNode l1, String list){
        if (l1 == null) {
            return list;
        }
        do {
            list = list + l1.val + "";
            if (l1.next != null) {
                l1 = l1.next;
            } else {
                break; // Salir del bucle si no hay un próximo nodo
            }
        } while(true);
        System.out.println(list);
        return list;
    }
    public String invertString(String list){
        String inverted = "";
        for (int i = list.length()-1; i >= 0 ; i--){
            inverted = inverted + list.charAt(i)+"";
        }
        System.out.println(inverted);
        return inverted;
    }


//    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
//        ListNode ln = new ListNode();
//        int sobrante = 1;
//        while(l1.next != null || l2.next != null){
//            ln.val = l1.val + l2.val;
//            ln.next = new ListNode();
//            ListNode newNode = new ListNode(l1.val + l2.val);
//        }
//    }

}
