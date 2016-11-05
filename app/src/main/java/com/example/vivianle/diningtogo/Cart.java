package com.example.vivianle.diningtogo;

import java.util.Queue;


import java.util.Queue;

/**
 * Created by candy hu on 2016/11/4.
 */

public class Cart {
    LinkedList<food> cartItem;
//    student s;
    Menu todayMenu;
    double price;
    public Cart() {
//        this.s = s;
        cartItem = new LinkedList<food>();
        todayMenu = new Menu();
        price = 0;
    }

    public double getPrice() {
        return price;
    }

    /**
     * add item to cart
     */
    public void addToCart(int cat, int i, String restriction){
        if(cat == 1){
            if(i >= todayMenu.getCharboiled().length){
                return;
            }
            food orderItem = todayMenu.getCharboiled()[i];
            orderItem.setRestriction(restriction);
            cartItem.insertFirst(orderItem);
        }else if(cat == 2){
            if(i >= todayMenu.getGrilled().length){
                return;
            }
            food orderItem = todayMenu.getGrilled()[i];
            orderItem.setRestriction(restriction);
            cartItem.insertFirst(orderItem);
        }else if(cat == 3){
            if(i >= todayMenu.getSalad().length){
                return;
            }
            food orderItem = todayMenu.getSalad()[i];
            orderItem.setRestriction(restriction);
            cartItem.insertFirst(orderItem);
        }else {
            if (i >= todayMenu.getSpecial().length) {
                return;
            }
            food orderItem = todayMenu.getSpecial()[i];
            orderItem.setRestriction(restriction);
            cartItem.insertFirst(orderItem);
        }
        price = calcaulteSum();
    }



    /**
     * remove item from cart
     */
    public void removeFromCart(int cat, int i){
        food delete = new food(null,0);
        LinkedListNode<food> temp = cartItem.getFirstNode();
        if (temp == null){
            return;
        }else

        if(cat == 1){
            delete = todayMenu.getCharboiled()[i];
        }else if(cat ==2){
            delete = todayMenu.getGrilled()[i];
        }else if(cat == 3){
            delete = todayMenu.getSalad()[i];
        } else if(cat == 4){
            delete = todayMenu.getSpecial()[i];
        }

        if(temp.getData().getFoodName().compareTo(cartItem.getFirst().getFoodName())==0){

            cartItem.deleteFirst();

        }
        LinkedListNode<food>next = temp.getNext();

        while(next != null){
            if(next.getData().getFoodName().compareTo(delete.getFoodName())==0){

                cartItem.deleteNext(temp);

            }
            temp = next;
            next = temp.getNext();
        }
        price = calcaulteSum();
    }

    /**
     * calculate the total
     * @return return the sum
     */
    public double calcaulteSum(){
        double sum = 0;
        LinkedListNode<food> temp = cartItem.getFirstNode();
        while(temp != null){
            sum += temp.getData().getPrice();
            temp = temp.getNext();
        }
        return sum;
    }

//    /**
//     * add item to student's favorite list
//     * @param cat category
//     * @param i item index
//     */
//    public void addToFavorite(int cat, int i){
//        if(cat == 1){
//            s.addFavorite(todayMenu.getCharboiled()[i]);
//        }else if(cat == 2){
//            s.addFavorite(todayMenu.getGrilled()[i]);
//        }else if(cat == 3){
//            s.addFavorite(todayMenu.getSalad()[i]);
//        }else if(cat == 4){
//            s.addFavorite(todayMenu.getSpecial()[i]);
//        }
//    }

    public String toString(){
        String str = "";
        LinkedListNode<food> node = cartItem.getFirstNode();
        while(node != null){
            str += node.getData().getFoodName() + " - $" + Double.toString(node.getData().getPrice()) + " \n";
            node = node.getNext();
        }
        return str;
    }

    public LinkedList<food> getCartItems(){
        return cartItem;
    }
}


///**
// * Created by candy hu on 2016/11/4.
// */
//
//public class Cart {
//   LinkedList<food> cartItem;
//    Menu todayMenu;
//    int price;
//    public Cart() {
//        cartItem = new LinkedList<food>();
//        todayMenu = new Menu();
//        price = 0;
//    }
//
//    /**
//     * add item to cart
//     */
//    public void addToCart(int cat, int i, String restriction){
//            if(cat == 1){
//                food orderItem = todayMenu.getPizza()[i];
//                orderItem.setRestriction(restriction);
//               cartItem.insertFirst(orderItem);
//            }else if(cat == 2){
//                food orderItem = todayMenu.getGrilled()[i];
//                orderItem.setRestriction(restriction);
//                cartItem.insertFirst(orderItem);
//            }else if(cat == 3){
//                food orderItem = todayMenu.getSalad()[i];
//                orderItem.setRestriction(restriction);
//                cartItem.insertFirst(orderItem);
//            }else if(cat == 4){
//                food orderItem = todayMenu.getSpecial()[i];
//                orderItem.setRestriction(restriction);
//                cartItem.insertFirst(orderItem);
//            }else {
//                food orderItem = todayMenu.getSandwich()[i];
//                orderItem.setRestriction(restriction);
//                cartItem.insertFirst(orderItem);
//            }
//        price = calcaulteSum();
//    }
//
//
//
//    /**
//     * remove item from cart
//     */
//    public void removeFromCart(int cat, int i){
//        LinkedListNode<food> temp = cartItem.getFirstNode();
//        if (temp == null){
//            return;
//        }
//        food delete = new food(null,0);
//       if(cat == 1){
//           delete = todayMenu.getPizza()[i];
//       }else if(cat ==2){
//           delete = todayMenu.getGrilled()[i];
//       }else if(cat == 3){
//           delete = todayMenu.getSalad()[i];
//       } else if(cat == 4){
//           delete = todayMenu.getSpecial()[i];
//       } else if(cat == 5){
//           delete = todayMenu.getSandwich()[i];
//       }
//
//        if(temp.getData().getFoodName().compareTo(cartItem.getFirst().getFoodName())==0){
//            cartItem.deleteFirst();
//            return;
//        }
//            LinkedListNode<food>next = temp.getNext();
//
//        while(next != null){
//            if(next.getData().getFoodName().compareTo(delete.getFoodName())==0){
//                cartItem.deleteNext(temp);
//            }
//            temp = next;
//            next = temp.getNext();
//        }
//        price = calcaulteSum();
//    }
//
//    /**
//     * calculate the total
//     * @return return the sum
//     */
//    public int calcaulteSum(){
//        int sum = 0;
//        LinkedListNode<food> temp = cartItem.getFirstNode();
//        while(temp != null){
//           sum += temp.getData().getPrice();
//            temp = temp.getNext();
//        }
//        return sum;
//    }
//
//    /**
//     * add item to student's favorite list
//     * @param cat category
//     * @param i item index
//     */
//    public void addToFavorite(int cat, int i){
//        if(cat == 1){
//           s.addFavorite(todayMenu.getPizza()[i]);
//        }else if(cat == 2){
//            s.addFavorite(todayMenu.getGrilled()[i]);
//        }else if(cat == 3){
//            s.addFavorite(todayMenu.getSalad()[i]);
//        }else if(cat == 4){
//            s.addFavorite(todayMenu.getSpecial()[i]);
//        }else {
//            s.addFavorite(todayMenu.getSandwich()[i]);
//        }
//    }
