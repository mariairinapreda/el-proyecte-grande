import classes from "./CaseDetails.module.scss"

const CaseDetails = ({numberOfHDD, numberOfSSD}) => (
	<table className={classes.customCardDetails}>
		<tbody>
			<tr>
				<td>Number of HDD: {numberOfHDD}</td>
			</tr>
			<tr>
				<td>Number of SSD: {numberOfSSD}</td>
			</tr>
		</tbody>
	</table>
);

export default CaseDetails;