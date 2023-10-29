package structural_pattern.Composite

import creational_pattern.Prototype.Product

class CompositeProduct (name: String, tax:Double, quantity:Long = 1):

    AbstractProduct (name, 0.0, 0.0,0){

    private val products: MutableList<AbstractProduct> = ArrayList()

    fun addProduct(product: AbstractProduct){
        products.add (product)
    }

    fun removeProduct(product: AbstractProduct): Boolean{
        return products.remove(product)
    }

    override fun getPrice(): Double {
        return products.sumOf { it.getPrice() * it.quantity }
    }

    fun getTotalTax(): Double {
        return this.getPrice() * (this.tax/100)
    }
    fun getTotal(): Double {
        return this.getPrice() + this.getTotalTax()
    }

}

