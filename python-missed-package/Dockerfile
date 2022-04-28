FROM python:3.10

WORKDIR /app

RUN pip install fastapi uvicorn[standard]

COPY index.py .
CMD ["uvicorn", "index:app", "--host", "0.0.0.0", "--port", "80"]
