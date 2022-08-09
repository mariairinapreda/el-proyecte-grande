import classes from "./ProductsContainer.styles.scss"
const ProductsContainer = (props) => {
    return (
        <div className={classes.products}>
            <div className={classes.cardsContainer}>
                {
                    props.children
                }
            </div>
        </div>
    )
}
export default ProductsContainer;