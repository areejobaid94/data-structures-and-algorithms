package hashtable;

import linkedList.LinkedList;
import linkedList.Node;

import java.util.Arrays;

public class Hashtable<T> {
    private Object[] hashNodesList = new Object[1024];

    public Hashtable() {
    }

    public Hashtable(Object[] hashNodesList) {
        this.hashNodesList = hashNodesList;
    }

    public Object[] getHashNodesList() {
        return hashNodesList;
    }

    public void setHashNodesList(Object[] hashNodesList) {
        this.hashNodesList = hashNodesList;
    }

    int hashFunc(char c) {
        return (c);
    }

    public int hash(T S) {
        int hasHCharsSum = 0;
        String convertedString = S.toString();
        for (int i = 0; i < convertedString.length(); i++) {
            int index = hashFunc(convertedString.charAt(i));
            hasHCharsSum +=index;
        }
        return hasHCharsSum * 599 % 1024;

    }

    public void add(T key, T value) {
        int index = hash(key);
        HashTableNode newNode = new HashTableNode(key, value);
        LinkedList linkedList = new LinkedList();
        if (hashNodesList[index] != null) {
            linkedList = (LinkedList) hashNodesList[index];
        }
        linkedList.insert((T) newNode);
        hashNodesList[index] = (T) linkedList;

    }

    public T get(T key) {
        int index = hash(key);
        if (hashNodesList[index] != null) {
            LinkedList linkedList = (LinkedList) hashNodesList[index];
            Node current = linkedList.head;
            while (current != null) {
                if (((HashTableNode) current.val).getKey() == key) {
                    return (T) ((HashTableNode) current.val).getValue();
                }
                current=current.next;
            }
        }
        return null;
    }

    public boolean contains(T key) {
        int index = hash(key);
        if (hashNodesList[index] != null) {
            LinkedList linkedList = (LinkedList) hashNodesList[index];
            Node current = linkedList.head;
            while (current != null) {
                if (((HashTableNode<Object>) current.val).getKey() == key) {
                    return true;
                }
                current=current.next;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hashtable{" +
                "hashNodesList=" + Arrays.toString(hashNodesList) +
                '}';
    }
}

