#include <iostream>

class Node {
    public:
        int data;
        Node* left;
        Node* right;

        Node(int value) {
            this->data = value;
            this->left = nullptr;
            this->right = nullptr;
        }

        Node(int value, Node* left) {
            this->value = value;
            this->left = left;
            this->right = nullptr;
        }

        Node(int value, Node* left, Node* right) {
            this->value = value;
            this->left = left;
            this->right = right;
        }
};
