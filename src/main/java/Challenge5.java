import java.util.LinkedList;

/*5. Remove duplicates on email thread:
        When different email clients are used on a same thread, the discussion get messy
        because old messages are included again and get duplicated. Given a email thread
        (represented by a singly unsorted linked list of messages), write a function that
        remove duplicated messages from it.*/

public class Challenge5 {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ola Helder tudo bem?");
        linkedList.add("Ola IA tudo bem e com vc?");
        linkedList.add("Ola Helder tudo bem?");
        linkedList.add("Estou bem!");
        linkedList.add("Ola IA tudo bem e com vc?");
        linkedList.add("Ola Helder tudo bem?");

        System.out.println(removeDup(linkedList));
    }

    private static LinkedList<String> removeDup(LinkedList<String> linkedList) {

        LinkedList<String> newList = new LinkedList<>();

        for (String message : linkedList){
            if (!newList.contains(message)){
                newList.add(message);
            }
        }
        return newList;
    }
}
