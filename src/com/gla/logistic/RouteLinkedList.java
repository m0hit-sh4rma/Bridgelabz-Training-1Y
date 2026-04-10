package com.gla.logistic;

    class RouteLinkedList<T extends Checkpoint> {

        private Node<T> head;

        // Add checkpoint
        public void addCheckpoint(T checkpoint) {
            Node<T> newNode = new Node<>(checkpoint);

            if (head == null) {
                head = newNode;
                return;
            }

            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Remove checkpoint
        public boolean removeCheckpoint(String checkpointId) {
            if (head == null) return false;

            if (head.data.id.equals(checkpointId)) {
                head = head.next;
                return true;
            }

            Node<T> temp = head;
            while (temp.next != null) {
                if (temp.next.data.id.equals(checkpointId)) {
                    temp.next = temp.next.next;
                    return true;
                }
                temp = temp.next;
            }

            return false;
        }

        // Find checkpoint
        public T findCheckpoint(String checkpointId) {
            Node<T> temp = head;

            while (temp != null) {
                if (temp.data.id.equals(checkpointId)) {
                    return temp.data;
                }
                temp = temp.next;
            }

            return null;
        }

        // Total distance
        public double computeTotalDistance() {
            double total = 0;
            Node<T> temp = head;

            while (temp != null) {
                total += temp.data.distanceFromPrevious;
                temp = temp.next;
            }

            return total;
        }

        // Total penalty
        public double computeTotalPenalty() {
            double total = 0;
            Node<T> temp = head;

            while (temp != null) {
                total += temp.data.computePenalty();
                temp = temp.next;
            }

            return total;
        }

        // Route score
        public double computeRouteScore() {
            return computeTotalDistance() - computeTotalPenalty();
        }

        // Consistency check
        public boolean isConsistent() {
            boolean hasDelivery = false;
            boolean hasFuel = false;

            Node<T> temp = head;

            while (temp != null) {
                if (temp.data instanceof DeliveryCheckpoint) hasDelivery = true;
                if (temp.data instanceof FuelCheckpoint) hasFuel = true;
                temp = temp.next;
            }

            return hasDelivery && hasFuel;
        }

        // Print route
        public void printRoute() {
            Node<T> temp = head;

            while (temp != null) {
                System.out.println(
                        temp.data.id + " | " +
                                temp.data.name + " | Distance: " +
                                temp.data.distanceFromPrevious
                );
                temp = temp.next;
            }
        }
    }
