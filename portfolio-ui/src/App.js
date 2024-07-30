import './styles/styles.css';
import Login from './components/Login';
import Header from './components/Header';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import User from './components/Portfolio';
import Footer from './components/Footer';
import Dashboard from './components/Dashboard';

function App() {
  return (
    <div className="App">
      <Header/>    
      <BrowserRouter>
        <Routes>
          <Route path="/admin" element={<Dashboard/>} />
          <Route path="/user" element={<User/>} />
          <Route path="/" exact element={<Login/>} /> {/* Default login route */}
        </Routes>
      </BrowserRouter>
      <Footer/>
    </div>
  );
}

export default App;
