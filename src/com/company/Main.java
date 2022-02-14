package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Book[] listBook = new Book[5];
        listBook[0] = new Book("So do", "Vũ Trọng Phụng", 100000, 4, 0.5);
        listBook[1] = new Book("Vo nhat", "Kim Lân", 60000, 2, 0.3);
        listBook[2] = new Book("Vo chong A Phu", "Tô Hoài", 80000, 1, 0.3);
        listBook[3] = new Book("De men phieu luu ki", "Tô Hoài", 120000, 2, 0.5);
        listBook[4] = new Book("Toi yeu em", "Puskin", 40000, 6, 0.2);

        double sumQuantity = 0;
        for (int i = 0; i < listBook.length; i++) {
            sumQuantity += listBook[i].getQuantity();
        }
        System.out.println("Tổng số lượng sách có trong thư viện là: " + sumQuantity + " cuốn");

        double sumPrice = 0;
        for (int i = 0; i < listBook.length; i++) {
            sumPrice += listBook[i].getTotalPrice();
        }
        System.out.println("Tổng số tiền sách có trong thư viện là: " + sumPrice + "VNĐ");

        double sumWeight = 0;
        for (int i = 0; i < listBook.length; i++) {
            sumWeight += listBook[i].getTotalWeight();
        }
        System.out.println("Tổng khối lượng sách có trong thư viện là: " + sumWeight + "Kg");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sách bạn cần tìm: ");
        String name = scanner.nextLine();
        findBook(listBook, name);
    }
    public static void findBook(Book[] books, String name){
        boolean check = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name)){
                System.out.println("Tên sách: " + books[i].getName());
                System.out.println("Tác giả: " + books[i].getAuthor());
                System.out.println("Số lượng đang có: " + books[i].getQuantity() + " cuốn");
                System.out.println("Giá tiền: " + books[i].getPrice() + "VNĐ");
                check = true;
                break;
            }
        }
        if (check == false)
            System.out.println("Không tìm thấy!");
    }
}

