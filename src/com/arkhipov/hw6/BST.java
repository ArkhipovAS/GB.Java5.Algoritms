package com.arkhipov.hw6;

import java.security.Key;

public class BST<Key extends Comparable<Key>, Value>  { //binary symbol table
    private class Node{
        Key key;
        Value value;
        Node left;
        Node right;
        int size;
        int level;
        int levelr;
        int levell;
        boolean avltree;

        public Node (Key key, Value value, int size, int level, int levelr, int levell, boolean avltree){
            this.key = key;
            this.value = value;
            this.size = size;
            this.level = level;
            this.levelr = levelr;
            this.levell = levell;
            this.avltree = avltree;
        }
    }

    private Node root = null;

    public boolean isEmpty(){return root == null;}

    public int levelr () {return this.levelr(root);}

    private int levelr(Node node){
        if (node == null){
            return 0;
        }
        else{
            return node.levelr;
        }
    }

    public int levell () {return this.levell(root);}

    private int levell(Node node){
        if (node == null){
            return 0;
        }
        else{
            return node.levell;
        }
    }

    public boolean avltree() {return  this.avltree(root);}

    private boolean avltree(Node node) {
        if (node == null){
            return false;
        }
        else{
            return node.avltree;
        }
    }

    public int level () {return this.level(root);}

    private int level(Node node){
        if (node == null){
            return 0;
        }
        else{
            return node.level;
        }
    }

    public int size (){
        return this.size(root);
    }

    private int size (Node node){
        if(node == null){
            return 0;
        }
        else{
            return node.size;
        }
    }

    public Value get (Key key){
        return get(root, key);
    }

    private Value get (Node node, Key key){
        if(key == null){
            throw new IllegalArgumentException("Не может быть ключа со значением Null");
        }
        if(node == null){
            return null;
        }
        int cmp = key.compareTo(node.key);
        if(cmp == 0){
            return node.value;
        }
        else if (cmp < 0){
            return get(node.left, key);
        }
        else {//cmp >0
            return get(node.right, key);
        }
    }

    public boolean contains (Key key){
        return get(root, key) != null;
    }

    private Node put(Node node, Key key, Value value){
        if (node == null){
           return new Node(key, value, 1, 0, 0, 0, true);
        }

        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            node.value = value;
        }
        else if(cmp < 0){
            node.left = put(node.left, key, value);

        }
        else{
            node.right = put(node.right, key, value);

        }


        node.size = size(node.left) + size(node.right) + 1;
        node.level = Math.max(level(node.left), level(node.right)) + 1;
        System.out.println("node.level: " + node.level);

        return node;
    }

    public void put (Key key, Value value){
        if(key == null){
            throw new IllegalArgumentException("Не может быть ключа со значением Null");
        }
        root = put(root, key, value);
    }

    private Node min (Node node){
        if(node.left == null){
            return node;
        }
        else{
            return min(node.left);
        }
    }
    private Node max (Node node){
        if(node.right == null){
            return node;
        }
        else{
            return max(node.right);
        }
    }

    private Node deleteMin (Node node){
        if (node.left == null){
            return node.right;
        }
        node.left = deleteMin(node.left);
        return node;
    }

    public void deleteMin (){
        if(isEmpty()){
            throw new IllegalArgumentException("Не может быть ключа со значением Null");
        }
        root = deleteMin(root);
    }

    private Node deleteMax (Node node){
        if (node.right == null){
            return node.right;
        }
        node.right = deleteMin(node.right);
        return node;
    }

    public void deleteMax (){
        if(isEmpty()){
            throw new IllegalArgumentException("Не может быть ключа со значением Null");
        }
        root = deleteMin(root);
    }

    private Node delete (Node node, Key key){
        if (node == null){
            return null;
        }
        int cmp = key.compareTo(node.key);
        if(cmp < 0){
            node.left = delete(node.left, key);
        }
        else if(cmp > 0) {
            node.right = delete(node.right, key);
        }
        else {
            if(node.left == null){
                return node.right;
            }
            if (node.right == null){
                return node.left;
            }

            Node tmp = node;
            node = max(node.left);
            node.left = deleteMax(tmp.left);
            node.right = tmp.right;
            tmp = null;
        }
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    public void delete(Key key) {
        root = delete(root, key);
    }
}
