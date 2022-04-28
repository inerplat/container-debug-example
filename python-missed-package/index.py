from fastapi import FastAPI, Response, status
import numpy as np
app = FastAPI()


@app.get("/", status_code=200)
def root_controller(row: int, col: int):
    return np.random.rand(row, col).tolist()
