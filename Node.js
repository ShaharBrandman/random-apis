class node {
    constructor(left, right, value) {
        this.left = left
        this.right = right
        this.value = value
    }

    getValue() {
        return this.value
    }

    getRight() {
        return this.right
    }

    getLeft() {
        return this.left
    }

    hasValue() {
        return this.value != undefined
    }

    hasRight() {
        return this.right != undefined
    }

    hasLeft() {
        return this.left != undefined
    }

    setRight(right) {
        this.right = right
    }

    setLeft(left) {
        this.left = left
    }

    setValue(value) {
        this.value =value
    }
}
