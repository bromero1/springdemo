import { AnySoaRecord } from "dns";
import { useEffect, useState } from "react";

export default function Home() {
  const [isUser, setUser] = useState<any | null>();

  useEffect(() => {
    fetch(`http://localhost:8080/api/person?id=${1}`)
      .then((response) => response.json())
      .then((data) => {
        setUser(data);
      })
      .catch((error) => console.log(error));
  }, []);

  return <div>Hello {isUser?.first_name}  </div>;
}
