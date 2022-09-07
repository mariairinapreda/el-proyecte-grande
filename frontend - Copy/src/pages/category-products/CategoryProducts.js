import {useParams} from "react-router-dom";

const CategoryProducts = () => {
  const {categoryName} = useParams();
  console.log(categoryName)

    return (
        <>THIS IS THE CATEGORY: {categoryName}</>
    )
}

export default CategoryProducts