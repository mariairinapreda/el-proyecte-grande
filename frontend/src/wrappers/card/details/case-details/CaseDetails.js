

const CaseDetails = ({numberOfHDD, numberOfSSD}) => (
	<table className={"custom-card-details"}>
		<tbody>
			<tr>
				<td>Number of HDD: {numberOfHDD}</td>
				<td>Number of SSD: {numberOfSSD}</td>
			</tr>
		</tbody>
	</table>
);

export default CaseDetails;