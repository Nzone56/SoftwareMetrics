export const getData = async ( code ) => {

  const encoded = encodeURI(code); 
  console.log(encoded)
  const url = `http://localhost:8080/api/user/${encoded}`;
  	const resp = await fetch(url, {
      mode: "no-cors",
    });

  const data  = await resp.text();

  return data;
};



