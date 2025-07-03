import './App.css';
import TaskList from './Components/TaskList';


// testing the main components of the app api from backend
// This is the main entry point of the React application
function App(){
    return (
        <div>
            <header>
                <h1>
                    Task Management Automation
                </h1>
            </header>
            <main>
                <TaskList />
            </main>
        </div>
    )
}
export default App;