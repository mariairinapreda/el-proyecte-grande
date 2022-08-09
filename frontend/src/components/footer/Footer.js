// import "../scss/main.css"

const Footer = () => {
  return (
    <div className="footer-div">
      <div className={"footer-text-div"}>
        <span>L.M.A Team &copy; 2022 Codecool Bucharest</span>
      </div>
      <div>
        <a
          href="src/components/footer/Footer"
          target="_blank"
          rel="noreferrer"
        >
          {" "}
          Loredana-Stefania Mihai{" "}
        </a>
        |
        <a
          href="src/components/footer/Footer"
          target="_blank"
          rel="noreferrer"
        >
          {" "}
          Maria-Irina Preda{" "}
        </a>
        |
        <a
          href="src/components/footer/Footer"
          target="_blank"
          rel="noreferrer"
        >
          {" "}
          Marian-Andrei Sidor
        </a>
      </div>
    </div>
  );
};

export default Footer;
