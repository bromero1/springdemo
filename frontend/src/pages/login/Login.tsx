import axios from "axios";

export default function Login() {

    const handleGoogleLogin = async () => {
        var endpoint = "/auth/google";
        try {
            const response = await axios.get(endpoint);
            window.location.href = response.data.redirectUrl; 

        } catch (error){
            console.log("Error attempting to login with Google.")
        }
    }

  return (
    <div>
        <div>Login</div>
        <button onClick={handleGoogleLogin}>Login with Google</button>
    </div>
  )
}
