from locust import HttpUser, between, task

class WebsiteUser(HttpUser):
    wait_time = between(5, 15)

    @task
    def find_pet_by_id(self):
        self.client.get("/v2/pet/3")

    @task
    def add_pet(self):
        self.client.post("/v2/pet", json={
    "id": 123,
    "category": {
        "id": 1,
        "name": "snake"
    },
    "name": "horse",
    "photoUrls": [
        "urltest"
    ],
    "tags": [
        {
            "id": 122,
            "name": "tagtesti"
        }
    ],
    "status": "available"
})

    @task
    def delete_pet_by_id(self):
        self.client.delete("/v2/pet/123")

    @task
    def update_pet(self):
        self.client.put("/v2/pet", json={
  "id": 123,
  "category": {
    "id": 12,
    "name": "bird"
  },
  "name": "horse",
  "photoUrls": [
    "yeniUrl"
  ],
  "tags": [
    {
      "id": 13,
      "name": "yeniTag"
    }
  ],
  "status": "busy"
})

