/* 
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        input.nextLine();
        String word = input.nextLine();
        
        if(word.contains("lv")){
            System.out.println(0);
        } else if(word.indexOf('l')!=-1 || word.indexOf('v')!=-1 ){
            System.out.println(1);
        } else{
            System.out.println(2);
        }

        input.close();
    }
}


import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int originalInput = input.nextInt();
        int minutes = originalInput / 60;  
        int seconds = originalInput % 60;
        int hours = minutes / 60; 
        int finalMinures = minutes - (hours*60);
        
        
        System.out.println(hours + " " + ":" + " " + finalMinures + " " + ":" + " " + seconds);
        input.close();
    }
}

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int quantity = input.nextInt();
        String output = "";
        
        for(int i=0; i<2+quantity;i++){
            if(i==0 || i==quantity+1){
                output += "+" + "-".repeat(quantity) + "+" + "\n";
            } else{
                output += "|" + " ".repeat(quantity) + "|" + "\n";
            }
        }
        System.out.println(output);
        input.close();
    }
}

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        System.out.print((n+5)*3-10);
        
        input.close();
    }
}


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     

    public static void fizzBuzz(int n) {
    // Write your code here
    for(int i=1;i<=n;i++){
        if(i%3==0 && i%5==0){
            System.out.println("FizzBuzz");
            continue;
        } else if(i%3==0){
            System.out.println("Fizz");
        } else if(i%5==0){
            System.out.println("Buzz");
        } else{
            System.out.println(i);
        }
    }

    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = 15;

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    static class Teque {
        private Node head;
        private Node tail;
        private int size = 0;

        private static class Node {
            Node next;
            Node prev;
            int value;
            Node(int value) { this.value = value; }
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void push_front(int value) {
            Node n = new Node(value);
            if (isEmpty()) {
                head = tail = n;
            } else {
                n.next = head;
                head.prev = n;
                head = n;
            }
            size++;
        }

        public void push_back(int value) {
            Node n = new Node(value);
            if (isEmpty()) {
                head = tail = n;
            } else {
                n.prev = tail;
                tail.next = n;
                tail = n;
            }
            size++;
        }

        public void push_middle(int value) {
            int idx = (size + 1) / 2;   
        
            if (size == 0 || idx == 0) {           
                push_front(value);
                return;
            }
            
            Node at = nodeAt(idx);
            Node n = new Node(value);
        
            n.prev = at.prev;
            n.next = at;
            at.prev.next = n;       
            at.prev = n;
        
            size++;
        }

        public int get(int index) {
            Node cur = nodeAt(index);
            return cur.value;
        }

        private Node nodeAt(int index) {
            if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
            if (index <= size / 2) {
                Node cur = head;
                for (int i = 0; i < index; i++) cur = cur.next;
                return cur;
            } else {
                Node cur = tail;
                for (int i = size - 1; i > index; i--) cur = cur.prev;
                return cur;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(in.readLine().trim());
        Teque teq = new Teque();
        StringBuilder out = new StringBuilder();

        for (int k = 0; k < q; k++) {
            String line = in.readLine();
            String[] parts = line.split(" ");
            String cmd = parts[0];
            int x = Integer.parseInt(parts[1]);

            switch (cmd) {
                case "push_front":
                    teq.push_front(x);
                    break;
                case "push_back":
                    teq.push_back(x);
                    break;
                case "push_middle":
                    teq.push_middle(x);
                    break;
                case "get":
                    out.append(teq.get(x)).append('\n');
                    break;
                default:
            }
        }
        System.out.print(out.toString());
    }
}
*/
import java.util.*;


class Main{
    
    public static int[] findIndices(String str1, String str2){
        if(str1.length() != str2.length() +1){
            return new int[]{-1};
        }

        List<Integer> indices = new ArrayList<>();

        // We build a new string called candidate. str1.substring(0, i) → part before index i.
        // str1.substring(i + 1) → part after index i. Together, this removes the character at index i.


        for(int i=0;i<str1.length();i++){
            String candidate = str1.substring(0, i) + str1.substring(i+1);
            if(candidate.equals(str2)){
                indices.add(i);
            }
        }
        if (indices.isEmpty()){
            return new int[]{-1};
        }
        int[] result = new int[indices.size()];
        for(int i=0; i<indices.size();i++){
            result[i] = indices.get(i);
        }
        return result;
    }
    
    public static void main(String[] args){
        String str1 = "abdgggda";
        String str2 = "abdggda";

        int[] result = findIndices(str1, str2);

        System.out.println(Arrays.toString(result));
    }
}