import java.util.*;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {

    static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;

        while(temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null) {
            if(temp.data != stack.pop()) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x;
        ListNode head = null, temp = null;

        System.out.print("Enter number of nodes: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            x = sc.nextInt();
            ListNode newNode = new ListNode(x);

            if(head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        if(isPalindrome(head)) {
            System.out.println("Linked List is a Palindrome");
        } else {
            System.out.println("Linked List is NOT a Palindrome");
        }

        sc.close();
    }
}