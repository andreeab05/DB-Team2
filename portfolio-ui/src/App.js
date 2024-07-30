import './styles/styles.css';
import Login from './components/Login';
import Header from './components/Header';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Admin from './components/Admin';
import User from './components/User';
import Footer from './components/Footer';

function App() {
  return (
    <div className="App">
      <Header/>    
      <BrowserRouter>
        <Routes>
          <Route path="/admin" element={<Admin/>} />
          <Route path="/user" element={<User/>} />
          <Route path="/" exact element={<Login/>} /> {/* Default login route */}
        </Routes>
      </BrowserRouter>
      <Footer/>
    </div>
  );
}

export default App;
