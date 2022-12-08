import './Resources/carousel.css';
import './Resources/slidesNavigation.css';

function moveSlidesToRight(){

}
function moveSlidesToLeft() {

}
function arrowClickEventHandler(){

}
function Carousel(){
    return (
        <div className="carousel-area">
            <div className="carousel-img-box">
                <div className="carousel-img-area">
                    <div className="carousel-slides-area">
                        <div className="carousel-slide">
                            <img className="small-img" id="1" src="https://asura.gg/wp-content/uploads/2022/08/standardofReCover03.png"/>
                        </div>
                        <div className="carousel-slide second">
                            <img className="small-img" id="2" src="https://asura.gg/wp-content/uploads/2022/08/standardofReCover03.png"/>
                        </div>
                        <div className="carousel-slide third">
                            <img className="medium-img" id="3" src="https://asura.gg/wp-content/uploads/2022/08/standardofReCover03.png"/>
                        </div>
                        <div className="carousel-slide fourth">
                            <img className="medium-img" id="4" src="https://asura.gg/wp-content/uploads/2022/08/standardofReCover03.png"/>
                        </div>
                        <div className="carousel-slide fifth">
                            <img className="big-img" id="5" src="https://asura.gg/wp-content/uploads/2022/08/standardofReCover03.png"/>
                        </div>
                    </div>
                </div>
            </div>
            <div className="break"/>
            <div className="slides-navigation-area">
                <div className="click-area">
                    <img className="click-icon" id="left" src="https://via.placeholder.com/24x24"/>
                </div>
                <div className="navigation-gap"/>
                <div className="indicator-area">
                    <div className="current-indicator">
                        <div className="current-indicator-img"/>
                    </div>
                    <div className="indicator-gap"/>
                    <div className="indicator">
                        <div className="indicator-img"/>
                    </div>
                    <div className="indicator-gap"/>
                    <div className="indicator">
                        <div className="indicator-img"/>
                    </div>
                    <div className="indicator-gap"/>
                    <div className="indicator">
                        <div className="indicator-img"/>
                    </div>
                    <div className="indicator-gap"/>
                    <div className="indicator">
                        <div className="indicator-img"/>
                    </div>
                </div>
                <div className="navigation-gap"/>
                <div className="click-area">
                    <img className="click-icon" id="right" src="https://via.placeholder.com/24x24"/>
                </div>
            </div>
        </div>
    )
}

export default Carousel;