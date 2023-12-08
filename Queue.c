#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

struct Node {
    int value;
    struct Node* left;
    struct Node* right;
};

struct Queue {
    struct Node* head;
    struct Node* tail;
};

struct Node* createNode(int value) {
    struct Node* n =  (struct Node*) malloc(sizeof(struct Node));

    n->value = value;
    n->left = n->right = NULL;

    return n;
}

struct Queue* createQueue() {
    struct Queue* q = (struct Queue*) malloc(sizeof(struct Queue));

    q->head = q->tail = NULL;

    return q;
}

void insert(struct Queue* q, struct Node* n) {
    if (q->tail == NULL) {
        q->tail = q->head = n;
    }
    else {
        q->tail->right = n;
        n->left = q->tail;
        q->tail = n;
    }
}

struct Node* popHead(struct Queue* q) {
    if (q->head == NULL) {
        printf("Queue is empty\n");

        return NULL;
    }

    struct Node* removeNode = q->head;

    if (q->head == q->tail) {
        q->head = q->tail = NULL;
    }
    else {
        q->head = q->head->right;
        q->head->left = NULL;
    }

    return removeNode;
}

struct Node* popTail(struct Queue* q) {
    if (q->tail == NULL) {
        printf("Queue is empty\n");
        
        return NULL;
    }

    struct Node* removedNode = q->tail;

    if (q->head == q->tail) {
        q->head = q->tail = NULL;
    }
    else {
        q->tail = q->head->left;
        q->tail->right = NULL;
    }

    return NULL;
}

void freeQueue(struct Queue* q) {
    struct Node* current = q->head;
    while (current != NULL) {
        struct Node* next = current->right;
        free(current);
        current = next;
    }

    free(q);
}
