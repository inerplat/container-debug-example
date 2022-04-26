FROM python:3.10

WORKDIR /app

RUN pip install fastapi uvicorn[standard]

COPY . .
CMD ["uvicorn" "index:app" "--reload"]
