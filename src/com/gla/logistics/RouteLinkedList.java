package com.gla.logistics;

public class RouteLinkedList<T extends CheckPoint> {

    class Node {

        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;


    public void addCheckpoint(T checkpoint) {

        Node newNode = new Node(checkpoint);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }


    public boolean removeCheckpoint(String checkpointId) {

        if(head == null)
            return false;

        if(head.data.checkpointId.equals(checkpointId)) {
            head = head.next;
            return true;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr != null) {

            if(curr.data.checkpointId.equals(checkpointId)) {
                prev.next = curr.next;
                return true;
            }

            prev = curr;
            curr = curr.next;
        }

        return false;
    }


    public T findCheckpoint(String checkpointId) {

        Node temp = head;

        while(temp != null) {

            if(temp.data.checkpointId.equals(checkpointId))
                return temp.data;

            temp = temp.next;
        }

        return null;
    }


    public double computeTotalDistance() {

        double total = 0;
        Node temp = head;

        while(temp != null) {

            total += temp.data.distanceFromLast;
            temp = temp.next;
        }

        return total;
    }


    public double computeTotalPenalty() {

        double total = 0;

        Node temp = head;

        while(temp != null) {

            total += temp.data.calculatePenalty();
            temp = temp.next;
        }

        return total;
    }


    public void printRoute() {

        Node temp = head;
        int i=1;

        while(temp != null) {

            CheckPoint c = temp.data;

            String status= c.isDelayed() ? "Delayed":"On Time";

            System.out.println(i + ". " + c.getClass().getSimpleName() + " - " + c.locationName + " - " + status + " - Penalty: " + c.calculatePenalty());

            i++;
            temp=temp.next;
        }
    }


    public boolean criticalCheck() {

        boolean delivery=false;
        boolean fuel=false;

        Node temp=head;

        while(temp!=null) {

            if(temp.data.getType().equals("Delivery"))
                delivery=true;

            if(temp.data.getType().equals("Fuel"))
                fuel=true;

            temp=temp.next;
        }

        return delivery && fuel;
    }
}