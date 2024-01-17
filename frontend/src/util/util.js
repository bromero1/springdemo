// Simple function to pull parameter value from URL string.
export function getUrlParam(param, str) {
  const regex = new RegExp(`${param}=([^&]*)`);
  let match = str.match(regex);

  if (match === null) return null;

  return str.match(regex)[1];
}

// let string = "localhost:8080/api/person?name=bryan&df=3";

// console.log(getUrlParam("df", string));
