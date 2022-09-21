const SuccessPayment = () => {
  const params = new URLSearchParams(window.location.search);
  params.forEach((v, k) => console.log(`key: ${k}   value: ${v}`));

  return <>PLATA ACCEPTATA</>;
};

export default SuccessPayment;
