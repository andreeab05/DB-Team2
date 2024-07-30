import React from 'react';
import { useState } from "react";
import '../styles/styles.css';
import '../styles/component.css';

function Login() {

    const [userName, setUserName] = useState("");
    const [password, setPassword] = useState("");

    const handleSubmit = () => {
        console.log(userName, password)
    }

    return (
      <div className="login">
        <form className='loginForm'>
        <div data-mdb-input-init class="form-outline mb-4">
        <label class="form-label" for="email">Username or Email</label>
            <input type="email" id="email" class="form-control" 
            value = {userName}
            onChange={(e) => setUserName(e.target.value) } />
            
        </div>
        <div data-mdb-input-init class="form-outline mb-4">
        <label class="form-label" for="password">Password</label>
            <input type="password" id="password"
             class="form-control" 
             value = {password}
             onChange={(e) => setPassword(e.target.value)}/>
        </div>
        <button type="button" className="btn btn-primary" onClick={handleSubmit}>
          Login
        </button>
        </form>
      </div>
    );
  }

export default Login;