import './Resources/header.css';


function Header(){
    return (
        <div className="header-area">
            <div className="header-surface">
                <div className="header-links">
                    <p className="header-links-text">Link 1</p>
                    <div className="header-gap"/>
                    <p className="header-links-text">Link 2</p>
                    <div className="header-gap"/>
                    <p className="header-links-text">Link 3</p>
                </div>
            </div>
        </div>
    )
}
export default Header;