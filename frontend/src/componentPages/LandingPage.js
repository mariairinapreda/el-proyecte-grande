import {Fragment} from "react";
import navigation from "../components/navigation";
import footer from "../components/footer";

function landingPage() {
    return(
        <Fragment>
            {navigation}
            {footer}
        </Fragment>
    )
}

export default landingPage();