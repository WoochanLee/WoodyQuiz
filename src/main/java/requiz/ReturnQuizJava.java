package requiz;

import java.util.ArrayList;

class ReturnQuizJava {
    public static void main(String[] args) {
        ArrayList<String> clientList = new ArrayList<>();
        clientList.add("1");
        clientList.add("2");
        clientList.add("3");
        clientList.add("4");

        System.out.println("<JAVA>");

        clientList.forEach(s -> {
            if (s.equals("2")) {
                return;
            }
            System.out.println(s);
        });

        System.out.println("end");
    }
}