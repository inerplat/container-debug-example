from fastapi import FastAPI

app = FastAPI()


@app.get("/")
def root_controller():
    return "Hell World"